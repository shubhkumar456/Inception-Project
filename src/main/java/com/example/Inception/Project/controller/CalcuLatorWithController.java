package com.example.Inception.Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.coyote.http11.Constants.a;

@RestController
public class CalcuLatorWithController {


    @RequestMapping("/Pluss")
    public int addition(@RequestParam int a,@RequestParam int b){
        int result =a+b;
        return result;
    }

    @RequestMapping("/Subss")
    public int substraction(@RequestParam int a,@RequestParam int b){
        int result =a-b;
        return result;
    }

    @RequestMapping("/mulls")
    public int multiply(@RequestParam int a,@RequestParam int b){
        int result=a*b;
        return result;
    }

    @RequestMapping("/divs")
    public int division(@RequestParam int a,@RequestParam int b){
        int result = a/b;
        return result;
    }
}
