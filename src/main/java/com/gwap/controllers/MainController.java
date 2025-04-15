package com.gwap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {



    @RequestMapping(value = "/")
    public String getRoot() {
        //TODO: get posts from db
        //TODO: add post list to page
        return "index";
    }

    @RequestMapping(value = "/app")
    public String getApp() {
        return "app";
    }

}
