package com.hybridco.cognitaarchiveservice.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/admin")
public class ControllerTest {

    private Service service;

    @GetMapping
    public String get() {
        System.out.println("hello");
        return service.get();
    }
}
