package com.zmjt.nacos.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyz
 * <p>
 * 测试控制器
 */
@RestController
public class ConsumerOneController {

    @RequestMapping("/test")
    public String test() {
        return "ok";
    }
}
