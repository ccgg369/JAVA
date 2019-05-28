package com.greenplatform.dao;

import com.greenplatform.model.TGreenZzJzjl;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGreenZzJzjlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_zz_jzjl
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("cLsh") String cLsh, @Param("cZzzjlsh") String cZzzjlsh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_zz_jzjl
     *
     * @mbggenerated
     */
    int insert(TGreenZzJzjl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_zz_jzjl
     *
     * @mbggenerated
     */
    TGreenZzJzjl selectByPrimaryKey(@Param("cLsh") String cLsh, @Param("cZzzjlsh") String cZzzjlsh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_zz_jzjl
     *
     * @mbggenerated
     */
    List<TGreenZzJzjl> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_zz_jzjl
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TGreenZzJzjl record);
}