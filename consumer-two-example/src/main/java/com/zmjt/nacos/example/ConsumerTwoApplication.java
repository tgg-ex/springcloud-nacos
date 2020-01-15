package com.zmjt.nacos.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyz
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerTwoApplication.class, args);
    }
}
