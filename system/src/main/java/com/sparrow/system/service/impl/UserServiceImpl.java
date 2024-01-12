package com.sparrow.system.service.impl;

import com.sparrow.system.domain.User;
import com.sparrow.system.mapper.UserMapper;
import com.sparrow.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

}
