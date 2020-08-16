package com.ma.dao;

import com.ma.pojo.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public interface BlogMapper {

   List<Blog> getBlogIf(@Param("title") String titile, @Param("views") int views);

   /**
    * 使用map进行改造
    */
   List<Blog> getBlogByMap(Map map);

   List<Blog> getBlogByMaps(Map map);

   List<Blog> getBlogByChoose(Map map);

   int updateBlog(Map map);
}
