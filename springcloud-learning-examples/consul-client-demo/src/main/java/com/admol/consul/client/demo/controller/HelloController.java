package com.admol.consul.client.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : admol
 * @Date : 2018/11/11
 */
@RestController
public class HelloController{

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello(){
        List<String> services = discoveryClient.getServices();
        return "hello!, this is a consul client demo project. services:"+services;
    }
}
