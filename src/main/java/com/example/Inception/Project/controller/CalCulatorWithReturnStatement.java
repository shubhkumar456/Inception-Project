package com.example.Inception.Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalCulatorWithReturnStatement {

    @RequestMapping("/addition..")
    public String add(){
        int a= 10;
        int b= 100;
        int result = a+b;
        return "sum of addition :"+result;
    }

    @RequestMapping("/substraction..")
    public String subs(){
        int a= 100;
        int b= 20;
        int result = a-b;
        return "su of subs is : "+result;
    }

    @RequestMapping("/multiply..")
    public String multi(){
        int a= 12;
        int b = 13;
        int result = a*b;
        return "sum of multiplication is :"+result;
    }

    @RequestMapping("/division..")
    public String div(){
        int a = 1000;
        int b = 2;
        int result = a/b;
        return "sum of division :"+result;
    }
}
