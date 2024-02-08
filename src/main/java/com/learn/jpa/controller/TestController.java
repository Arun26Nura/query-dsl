package com.learn.jpa.controller;

import com.learn.jpa.repo.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    EngineRepository engineRepo;

    @GetMapping("hi")
    public List<String> getEngine(){
        return engineRepo.findByType("petrol","2010");
    }
}
