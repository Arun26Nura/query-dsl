package com.learn.jpa.controller;

import com.learn.jpa.entity.Engine;
import com.learn.jpa.repo.EngineRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    EngineRepoImpl engineRepo;

    @GetMapping("hi")
    public Engine getEngine(){
        return engineRepo.findById(1);
    }
}
