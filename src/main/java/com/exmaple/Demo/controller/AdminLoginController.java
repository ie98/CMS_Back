package com.exmaple.Demo.controller;

import com.exmaple.Demo.model.Admin;
import com.exmaple.Demo.model.User;
import com.exmaple.Demo.service.AdminLoginServiceImpl;
import com.exmaple.Demo.service.LoginServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@CrossOrigin("http://localhost:9001")
public class AdminLoginController {
    @Autowired
    private AdminLoginServiceImpl adminLoginService;
    @PostMapping("/adminLogin")
    @ResponseBody
    public String adminLogin(@RequestBody Admin admin ) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(adminLoginService.loginCheck(admin));
    }
}