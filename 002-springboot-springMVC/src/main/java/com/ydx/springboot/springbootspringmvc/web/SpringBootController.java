package com.ydx.springboot.springbootspringmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController {

    @RequestMapping(value = "/springBoot/say")
    public @ResponseBody
    String say() {
        return "Hello,springBoot!";
    }
}
