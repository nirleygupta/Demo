package com.nirley.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/get/{id}")
    String dummyEndpoint(String id) {
        return "Hello World";
    }

}
