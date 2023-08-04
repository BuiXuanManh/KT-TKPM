package com.dailycodebuffer.ServiceA.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class Service1Controller {

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL
            = "http://localhost:8081";

    private static final String SERVICE_1 = "service1";

    int count=1;

    @GetMapping
//    @CircuitBreaker(name = SERVICE_1, fallbackMethod = "service1Fallback")
//    @Retry(name = SERVICE_1,fallbackMethod = "service1Fallback")
    @RateLimiter(name = SERVICE_1,fallbackMethod = "service1Fallback")
    public String service1() {

        String url = BASE_URL;
        System.out.println("Retry method called " + count++ + " times at " + new Date());
        return restTemplate.getForObject(
                url,
                String.class
        );
    }

    public String service1Fallback(Exception e) {
        return "error connect service 2";
    }
}
