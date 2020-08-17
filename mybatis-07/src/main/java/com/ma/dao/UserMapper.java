package com.ma.dao;

import com.ma.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public interface UserMapper {

    User getUserById(@Param("id") int id);
}
