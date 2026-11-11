package com.company.employee_management_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {


    @GetMapping("/")
    public Map<String, String> welcome() {
        return Map.of( "message", "Welcome to Employee Management API",
                "version", "1.0");
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

}

