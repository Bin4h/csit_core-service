package com.core_service.core_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StudentController {
    @GetMapping
    public String getTestMessage() {
        return "testABC";
    }
}
