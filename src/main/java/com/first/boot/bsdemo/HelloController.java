package com.first.boot.bsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 *
 * @Author Li.Wei
 * @Date 2019/1/14 7:05 PM
 * @Description:
 */

@RestController
public class HelloController {

    @GetMapping
    public String say(){
        return "Hello World";
    }


    @GetMapping("/admin")
    public String admin(){
        return "需授权";
    }

    @GetMapping("/admin1")
    public String admin1(){
        return "后台管理页面";
    }
}
