package com.example.demo1.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping(path = "/")
    public String index() {
        return "index";
    }
    @GetMapping("/hello.do")
    public String hello() {
        return "hello";
    }

    // 클래스 = (속성과 메소드)

    // -> 주소매핑 ==> /
    // -> 주소 매핑 ==> /hello

}
