package com.ma.dao;


import com.ma.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    /**
     * 查询老师下面的所有学生包括学生姓名
     */

    List<Teacher> getTeachers(@Param("tid") int id);

    List<Teacher> getTeacher2(@Param("tid") int id);
}
