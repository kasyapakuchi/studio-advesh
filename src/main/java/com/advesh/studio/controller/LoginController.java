package com.advesh.studio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

import com.advesh.studio.service.LoginService;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;
    
    @PostMapping(value="/login")
    private @ResponseBody ResponseEntity<String> login(@RequestBody Map<String,String> loginParams){
        int loginStatus = loginService.login(loginParams);
        if(loginStatus==1){
            return ResponseEntity.status(200).body("Login Success");
        }
        else{
            return ResponseEntity.status(204).body("Login Failed!");
        }
    }
}
