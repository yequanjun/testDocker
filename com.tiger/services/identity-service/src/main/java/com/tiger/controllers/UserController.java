package com.tiger.controllers;

import com.tiger.models.UserLoginRequest;
import com.tiger.models.UserLoginResponseData;
import com.tiger.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("login")
    public UserLoginResponseData login(UserLoginRequest request){
        return userService.login("","");
    }
}
