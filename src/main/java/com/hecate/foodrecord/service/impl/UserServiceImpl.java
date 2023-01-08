package com.hecate.foodrecord.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hecate.foodrecord.entity.User;
import com.hecate.foodrecord.mapper.UserMapper;
import com.hecate.foodrecord.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
