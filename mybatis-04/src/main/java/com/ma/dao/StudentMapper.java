package com.ma.dao;

import com.ma.pojo.Student;

import java.util.List;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public interface StudentMapper {
    /**
     * 一次性查出所有的学生信息，包括老师的信息。
     */
    List<Student> getStudents();

    List<Student> queryStudents();
}
