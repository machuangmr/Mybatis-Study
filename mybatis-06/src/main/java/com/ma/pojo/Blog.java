package com.ma.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
@Data
public class Blog {

    private int id;

    private String title;

    private String author;

    private Date createTime;

    private int views;
}
