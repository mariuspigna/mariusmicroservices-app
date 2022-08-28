package com.mariusmicroservices.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestRootController {
    @GetMapping("/test")
    @ResponseBody
    public String yoo(){
        return "yooooooooo";
    }
}
