package com.online.travel.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel/gateway")
public class ApiGatewayController {

    @GetMapping("/health")
    public String health(){
        return "Success";
    }
}
