package com.zimawhite.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @RequestMapping("/accessed")
    public String accessed(){
        return "successful";
    }
}
