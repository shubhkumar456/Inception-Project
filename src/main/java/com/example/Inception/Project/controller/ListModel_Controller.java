package com.example.Inception.Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListModel_Controller {

    List<String> namelist = new ArrayList<>();

    @RequestMapping("/jodo")
    public String add(){
        namelist.add("Java");
        namelist.add("Spring boot");
        namelist.add("Microservices");
        return "object added";
    }

    @RequestMapping("/lana")
    public List<String> getNamelist(){
        return namelist;
    }

    @RequestMapping("/badalna")
    public String update(){
        namelist.remove(0);
        namelist.add(0,"Python");
        return "updated successfully";
    }

    @RequestMapping("/hatana")
    public String remove(){
        namelist.remove(1);
        return "removed successfully";
    }
}
