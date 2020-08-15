package com.ma;

import ma.dao.IUserDao;
import ma.pojo.User;
import ma.utils.MybatisUtils;
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
public class UserMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testGetUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testInsert() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        User h = new User(5L,"h", "12");
        mapper.insertUser(h);
        sqlSession.close();
    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        mapper.updateUser(new User(5L,"hellw", "123321"));
        sqlSession.close();
    }

    @Test
    public void testDelete() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        int i = mapper.deleteUserById(5L);
        sqlSession.close();
    }
}
