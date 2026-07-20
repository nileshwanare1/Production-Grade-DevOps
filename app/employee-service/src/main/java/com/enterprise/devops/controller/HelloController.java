package com.enterprise.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Employee Service is Running";
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {

        Map<String, String> response = new HashMap<>();

        response.put("Application", "Employee Service");
        response.put("Version", "1.0.0");
        response.put("Environment", "Development");
        response.put("Status", "Running");

        return response;
    }

}