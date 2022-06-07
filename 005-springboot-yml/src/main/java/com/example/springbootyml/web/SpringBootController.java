package com.example.springbootyml.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SpringBootController {

    @RequestMapping(value = "/say")
    public @ResponseBody
    String say() {
        return "Hello,springBoot!";
    }

    @RequestMapping(value = "/say1")
    @ResponseBody
    public Map say2() {
        Map<String,Object> map = new HashMap<>();
        map.put("message","hello springboot");
        return map;
    }
}
