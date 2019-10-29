package com.hsds.demo.service.impl;

import com.hsds.demo.mapper.UserMapper;
import com.hsds.demo.model.User;
import com.hsds.demo.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

}
