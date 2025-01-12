package com.greenplatform.interceptor;

import com.greenplatform.model.PlateUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 登陆验证
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    //目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //System.out.println("preHandle被调用！");
        PlateUser plateUser = (PlateUser) request.getSession().getAttribute("loginUser");
        //System.out.println("当前登陆用户--"+plateUser);
        if(plateUser == null){
            //未登陆，返回登陆页面
            response.sendRedirect(request.getContextPath()+"/base/login");  //未登录自动跳转界面
            return false;
        }else{
            //已登陆，判断用户权限

            //1.判断是否是是前端用户访问后台管理页面或后台用户访问前端页面,权限控制
            String requestURI = request.getRequestURI();
            //System.out.println(requestURI);
            if(plateUser.getcRylb().equals("2")&&requestURI.contains("plate")) {
                //response.getWriter().print("<a href= \" http://localhost:8080/Interceptor_2/user/toLoginPage.do\" >当前用户无权限访问该页面</a>");
                response.sendRedirect(request.getContextPath()+"/base/login");  //没有权限返回登陆页面
                return false;
            }else if(plateUser.getcRylb().equals("1")&&requestURI.contains("system")){
                response.sendRedirect(request.getContextPath()+"/base/login");  //没有权限返回登陆页面
                return false;
            }else{
                return true;
            }

        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //System.out.println("postHandle被调用！");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //System.out.println("afterCompletion被调用！");
    }
}
