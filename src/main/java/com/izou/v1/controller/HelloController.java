package com.izou.v1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZouYc.
 * @date 2022/9/19 13:39
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "HelloWorld";
    }
}
