package com.system;

import com.sparrow.system.SystemApplication;
import com.sparrow.system.domain.User;
import com.sparrow.system.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SystemApplication.class})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(12313L);
        user.setUserName("test1");
        user.setPassword("123456");

        // 添加数据
        boolean b = userService.addUser(user);
        Assert.assertTrue(b);
    }

}
