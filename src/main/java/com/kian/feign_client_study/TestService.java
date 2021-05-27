package com.kian.feign_client_study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestClient testClient;

    @Autowired
    public TestService(TestClient testClient) {
        this.testClient = testClient;
    }

    public String testFeign() {
        return testClient.testFeign();
    }
}
