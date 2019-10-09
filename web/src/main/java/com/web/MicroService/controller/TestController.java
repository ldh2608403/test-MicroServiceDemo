package com.web.MicroService.controller;

import com.demoone.dh.service.IAUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    IAUserService iaUserService;



    @GetMapping("/test")
    public String getCaseDistrustDegree(@RequestParam int id)
    {
        return iaUserService.getNameById(id);
    }
}
