package com.learn.jpa.controller;

import com.learn.jpa.repo.EngineRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    EngineRepositoryImpl engineRepo;

    @GetMapping("hi")
    public List<String> getEngine(){
        System.out.println(engineRepo.findById(1));
        return engineRepo.findByType("petrol","2010");
    }
}
