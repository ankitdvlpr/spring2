package com.spring2.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController  {
    @GetMapping("/home")
    public String home(){

        return "this is home page";
    }
}
