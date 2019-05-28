package com.greenplatform.dao;

import com.greenplatform.model.PlateLog;
import java.util.List;

public interface PlateLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cCzrzbh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int insert(PlateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    PlateLog selectByPrimaryKey(String cCzrzbh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    List<PlateLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlateLog record);
}