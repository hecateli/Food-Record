package com.hecate.foodrecord.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hecate.foodrecord.common.R;
import com.hecate.foodrecord.entity.User;
import com.hecate.foodrecord.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * login
     * @param request
     * @param user
     * @return
     */
    @PostMapping("/login")
    public R<User> login(HttpServletRequest request, @RequestBody User user){

        String password = user.getPassword();

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,user.getUsername());
        User customer = userService.getOne(queryWrapper);

        if(customer == null){
            return R.error("Login failed");
        }

        if(!customer.getPassword().equals(password)){
            return R.error("Login successfully");
        }

        if(customer.getStatus() == 0){
            return R.error("Account was disabled");
        }

        request.getSession().setAttribute("user",customer.getId());
        return R.success(customer);
    }

}
