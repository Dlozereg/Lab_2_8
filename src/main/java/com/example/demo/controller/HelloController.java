package com.example.demo.controller;

import com.example.demo.model.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Привет, мир!";
    }

    @PostMapping("/echo")
    public Message echo(@RequestBody Message input) {
        return input;
    }
}