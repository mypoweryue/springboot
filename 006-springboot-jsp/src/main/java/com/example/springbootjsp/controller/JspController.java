package com.example.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class JspController {

    @RequestMapping(value = "/jsp")
    public String jsp(Model model){
        model.addAttribute("data","springboot 使用jsp");
        return "index";
    }
}
