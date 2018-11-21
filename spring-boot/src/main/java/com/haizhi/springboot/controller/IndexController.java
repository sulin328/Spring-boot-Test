package com.haizhi.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	private final TestUser testUser;
	
    @Autowired
    public IndexController(TestUser testUser) {
        this.testUser = testUser;
    }
    
    @GetMapping("/index")
    public ResponseEntity helloWord() {
        return ResponseEntity.ok("hello word");
    }
    
    @GetMapping("/test")
    public ResponseEntity Test() {
    	System.out.println(testUser.toString());
        return ResponseEntity.ok(testUser.toString());
    }
}
