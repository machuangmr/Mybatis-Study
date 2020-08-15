package com.ma.dao;

import com.ma.pojo.User;
import com.ma.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestUserMapper {


    @Test
    public void testuser(){
        // 获取sqlSession对象，类似于我们之前的preparedStatement;
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 方法一： 通过sqlSession 获取到mapper对象，然后执行对应的操作。
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        // 执行对应的方法
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testInsert() {
        // 获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        mapper.insert(new User(4L,"小花", "431"));
        sqlSession.commit();
        sqlSession.close();
    }
}
