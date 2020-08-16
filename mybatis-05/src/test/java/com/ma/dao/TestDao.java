package com.ma.dao;


import com.ma.pojo.Teacher;
import com.ma.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestDao {

    @Test
    public void testTeacher() {
        TeacherMapper mapper = MybatisUtils.getSqlSession().getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
    }

    @Test
    public void testTeacher2 () {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeachers(1);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Test
    public void test () {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher2 = mapper.getTeacher2(1);
        for (Teacher teacher : teacher2) {
            System.out.println(teacher);
        }
    }
}