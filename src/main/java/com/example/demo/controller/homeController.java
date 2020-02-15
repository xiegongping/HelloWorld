package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class homeController {

    //参数a
    private Integer a;

    //参数b
    private String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    /**
     * @description: Hello World!!
     * @author: xiegongping
     * @date: 2020-2-15 11:38
     * @param: 无
     * @return: 结果
     */
    @RequestMapping("hello")
    public String sayHello() {
        System.out.println("测试1");
        System.out.println("测试2");
        String result = "ladies and gentlemen ,welcome to xiao guan jia !! ";
        return result;
    }
}
