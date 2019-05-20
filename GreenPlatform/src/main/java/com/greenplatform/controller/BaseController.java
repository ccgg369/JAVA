package com.greenplatform.controller;

import com.greenplatform.model.PlateUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Luowenlv on 2019/5/15,14:44
 * 基础控制
 */
@Controller
@RequestMapping(value = "/base")
public class BaseController {

    @GetMapping(value = "/index")
    public String index() {
        return "plate/yhgl/index";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "plate/login/login";
    }

    @GetMapping(value = "/loginout")
    public String loginout(HttpSession session){
        // 移除session
        session.removeAttribute("cLoginname");
        return "plate/login/login";
    }

    @GetMapping(value = "/rwgl")
    public String rwgl(){
        return "plate/rwgl/index";
    }

    @GetMapping(value = "/nlgl")
    public String nlgl(){
        return "plate/nlgl/index";
    }

    @GetMapping(value = "/spgl")
    public String spgl(){
        return "plate/spgl/index";
    }

    @GetMapping(value = "/stgl")
    public String stgl(){
        return "plate/stgl/index";
    }

    @GetMapping(value = "/zhsjgl")
    public String zhsjgl(){
        return "plate/zhsjgl/index";
    }

    @GetMapping(value = "/jcdm")
    public String test(){
        return "plate/jcdm/index";
    }
}