package com.gwap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {



    @RequestMapping(value = "/")
    public String getRoot() {
        return "index";
    }

    @RequestMapping(value = "/test")
    public String getTest() {
        return "test";
    }

    @RequestMapping(value = "/test2")
    public String getTest2() {
        return "test2";
    }
}
