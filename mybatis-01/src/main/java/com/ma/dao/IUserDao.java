package com.ma.dao;

import com.ma.pojo.User;

import java.util.List;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public interface IUserDao {
    List<User> getUsers();

    int insert(User user);
}
