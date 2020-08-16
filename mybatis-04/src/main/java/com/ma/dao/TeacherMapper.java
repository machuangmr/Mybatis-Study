package com.ma.dao;

import com.ma.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public interface TeacherMapper {

    @Select("select * from teacher where id= #{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
