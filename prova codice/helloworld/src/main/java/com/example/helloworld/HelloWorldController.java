package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "greeting";  // Questo dovrebbe corrispondere al nome del file HTML (hello.html)
    }
}
