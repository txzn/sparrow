package com.sparrow.system.service;

import com.sparrow.system.domain.User;

public interface UserService {

    /**
     * 添加数据
     * @param user 用户
     * @return true | false
     */
    boolean addUser(User user);

}
