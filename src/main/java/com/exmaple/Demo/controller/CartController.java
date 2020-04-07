package com.exmaple.Demo.controller;

import com.exmaple.Demo.dto.Cart;
import com.exmaple.Demo.dto.CartItem;
import com.exmaple.Demo.dto.UserId;
import com.exmaple.Demo.model.RedisCart;
import com.exmaple.Demo.service.CartServiceImpl;
import com.exmaple.Demo.util.Jackson;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("http://localhost:9000")
public class CartController {
    @Autowired
    CartServiceImpl cartService;
    @PostMapping("/addCart")
    @ResponseBody
    public String addCart(@RequestBody Cart cart ){
        System.out.println(cart.getCart().getFoodname());
       cartService.addCart(cart);

        return null;
    }
    @PostMapping("/getCart")
    @ResponseBody
    public String getCart(@RequestBody UserId userId) throws JsonProcessingException {
    System.out.println(userId.getId());
    String str = Jackson.classtoJson(cartService.getCart(userId.getId()));
    System.out.println(str);
        return str;
    }
}