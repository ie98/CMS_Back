package com.exmaple.Demo.controller;

import com.exmaple.Demo.service.FoodServiceImpl;
import com.exmaple.Demo.util.Jackson;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin("http://localhost:9000")
public class ClientFoodController {
    @Autowired
    FoodServiceImpl foodService;

    @GetMapping("/selectAllFood")
    @ResponseBody
    public String  selectAllFood() throws JsonProcessingException {
        return Jackson.classtoJson(foodService.selectAllFood());
    }
}