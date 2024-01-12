package com.sparrow.system.mapper;

import com.sparrow.system.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    boolean addUser(User user);

}
