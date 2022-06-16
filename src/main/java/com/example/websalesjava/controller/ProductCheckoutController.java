package com.example.websalesjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductCheckoutController {
    @GetMapping("/product_checkout")
    public String index(){
        return "checkout";
    }
}
