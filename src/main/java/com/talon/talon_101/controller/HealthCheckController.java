package com.talon.talon_101.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/hello")
    public String health() {
        return "Hello, this is TalonMMA!";
    }
}
