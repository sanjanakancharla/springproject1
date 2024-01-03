package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello/{name}/{age}")
    public void insert(@PathVariable("name") String name, @PathVariable("age") String age){
        System.out.println(name);
        System.out.println(age);
    }
}
