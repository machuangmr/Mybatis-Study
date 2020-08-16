package com.ma.dao;

import com.ma.pojo.Blog;
import com.ma.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class TestBlog {
    @Test
    public void testBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogIf = mapper.getBlogIf("", 0);
        for (Blog blog : blogIf) {
            System.out.println(blog);
        }
    }
    @Test
    public void testBlogByMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogByMap = mapper.getBlogByMap(new HashMap());
        for (Blog blog : blogByMap) {
            System.out.println(blog);
        }
    }
    @Test
    public void testGetBlogs() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogByMaps = mapper.getBlogByMaps(new HashMap());
        for (Blog blogByMap : blogByMaps) {
            System.out.println(blogByMap);
        }
    }

    @Test
    public void testBlogByChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> paramentMap = new HashMap<String, Object>();
        paramentMap.put("title", "mybatis");
        paramentMap.put("auth", "马老师");
        paramentMap.put("views", 1000);
        List<Blog> blogByChoose = mapper.getBlogByChoose(paramentMap);
        for (Blog blog : blogByChoose) {
            System.out.println(blog);
        }
    }
    @Test
    public void testUpdate() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> paramentMap = new HashMap<String, Object>();
        paramentMap.put("id", 1);
//        paramentMap.put("title", "mybatis");
        paramentMap.put("author", "马老大");
//        paramentMap.put("eviws", 1000);
        int i = mapper.updateBlog(paramentMap);
    }
}
