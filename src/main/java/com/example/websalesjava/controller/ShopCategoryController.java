package com.example.websalesjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShopCategoryController {

    @GetMapping("/shop_category")
    public String index(){
        return "category";
    }
}
