package com.sparrow.system.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String userName;

    private String password;

}
