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

    @RequestMapping(value = "/app")
    public String getApp() {
        return "app";
    }

    @RequestMapping(value = "/app2")
    public String getApp2() {
        return "app2";

    }


}
