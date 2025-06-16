package com.example.controller;

import com.example.models.RecurringData;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/demo")
public class DemoController {

    @Get(uri = "/")
    public RecurringData index() {
        return RecurringData.builder().build();
    }
}