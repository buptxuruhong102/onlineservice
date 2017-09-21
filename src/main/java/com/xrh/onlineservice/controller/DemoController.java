package com.xrh.onlineservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    protected static Logger logger=LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/home")
    public String home(){
        System.out.println("aaaaaaaaaaaa");
        return "index";
    }

    @RequestMapping("/data")
    @ResponseBody
    public String data(){
        return "data";
    }

}