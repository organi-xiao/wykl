package com.koala.service.impl;

import com.koala.mapper.UserMapper;
import com.koala.service.UserService;
import itcat.koala.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll() throws Exception {
        return userMapper.findAll();
    }
}
