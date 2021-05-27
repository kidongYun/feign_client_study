package com.kian.feign_client_study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public String main() {
        return testService.testFeign();
    }

    @GetMapping("/testFeign")
    public String testFeign() {
        return "Hello Feign client";
    }
}
