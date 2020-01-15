package com.zmjt.nacos.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zyz
 * <p>
 * 测试控制器
 */
@RestController
public class ConsumerTwoController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test() {
        return restTemplate.getForObject("http://consumer-one/test", String.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
