package com.ma.dao;

import com.ma.pojo.User;
import com.ma.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sun.rmi.server.UnicastServerRef2;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestUserMapper {

    @Test
    public void testUser() {
        /**
         * 在一次sqlSession中相同的查询结果会缓存起来，sqlSession.close() 后缓存会清空
         */

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.getUserById(1);
        System.out.println(user1);
        System.out.println("===========");
        User user2 = mapper.getUserById(1);
        System.out.println(user2);
        System.out.println(user1 == user2);
        sqlSession.close();
    }


    @Test
    public void testCache() {
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper.getUserById(1);
        System.out.println(user1);
        sqlSession1.close();


        UserMapper mapper1 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper1.getUserById(1);
        System.out.println(user2 == user1);
        sqlSession2.close();

    }
}
