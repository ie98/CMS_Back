package com.exmaple.Demo.controller;

import com.exmaple.Demo.model.Admin;
import com.exmaple.Demo.model.User;
import com.exmaple.Demo.service.AdminLoginServiceImpl;
import com.exmaple.Demo.service.LoginServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin("http://localhost:9001")

public class AdminLoginController {

    @Autowired
    private AdminLoginServiceImpl adminLoginService;
    /**
     * @Description adminLogin
     * @Author 411头目
     * @Date 2020/5/25 21:29
     * Param [admin]
     * Return java.lang.String
     **/
    @PostMapping("/adminLogin")
    public String adminLogin(@RequestBody Admin admin ) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(adminLoginService.loginCheck(admin));
    }
}
