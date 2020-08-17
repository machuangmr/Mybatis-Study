package com.ma.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
}
