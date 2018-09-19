package com.qiqi.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/hello")
    public String index(@RequestParams(value = '')) {
        return "Hello World";
    }
}
