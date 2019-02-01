package com.koala.test;

import com.koala.service.UserService;
import itcat.koala.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void findAll() throws Exception{
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
