package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${demo.secret}")
    public String secretKey;
    @GetMapping("/")
    public ResponseEntity hello() {
        return ResponseEntity.ok(secretKey);
    }
}
