package com.kian.feign_client_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
    Feign Client 사용할 것임을 명시
 */
@EnableFeignClients
@SpringBootApplication
public class FeignClientStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientStudyApplication.class, args);
    }

}
