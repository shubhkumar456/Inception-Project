package com.example.Inception.Project.controller;

import com.example.Inception.Project.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class LaptopmodelController {


    List <Laptop> lappilist = new ArrayList<>();

    @RequestMapping(value = "/Add8",method = RequestMethod.POST)
    public String add(@RequestBody Laptop laptop){
        lappilist.add(laptop);
        return "added successfully";
    }

    @RequestMapping(value = "/gets8",method = RequestMethod.GET)
    public List<Laptop> getLappilist(){
        return lappilist;
    }

    @RequestMapping(value = "/update8",method = RequestMethod.PUT)
    public String update(@RequestParam String name){
       lappilist.get(0).setName(name);
        return "updated successfully";
    }

    @RequestMapping(value = "/delete8",method = RequestMethod.DELETE)
       public String delete(@RequestParam String name){
        lappilist.remove(0);
        return "deleted successfully";
    }
}
