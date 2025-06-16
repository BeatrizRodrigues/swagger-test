package com.example.swagger.demo_spring.controller;


import com.example.swagger.demo_spring.models.RecurringData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/hello")
public class DemoController {

    @GetMapping(path = "/")
    public RecurringData index() {
        return RecurringData.builder().build();
    }
}