package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.version:1.0.0}")
    String version;

    @GetMapping("/")
    public ResponseEntity hello() {
        return ResponseEntity.ok("변경 테스트");
    }
}
