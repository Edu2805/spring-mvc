package com.devinhouse.showproduct.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticateEndPoint {

    @GetMapping
    public String authentication(){
        return "Auth";
    }
}
