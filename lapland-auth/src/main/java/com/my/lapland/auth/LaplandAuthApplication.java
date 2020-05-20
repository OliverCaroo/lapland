package com.my.lapland.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class LaplandAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaplandAuthApplication.class, args);
    }

}
