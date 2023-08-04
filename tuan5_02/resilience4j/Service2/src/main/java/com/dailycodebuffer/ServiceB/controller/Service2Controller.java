package com.dailycodebuffer.ServiceB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

    @GetMapping
    public String serviceB() {
        return "Service 2 is called from service 1";
    }

}
