package com.example.websalesjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductDetailsController {
    @GetMapping("/product_details")
    public String index(){
        return "single-product";
    }
}
