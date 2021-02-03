package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping(value ="/", method= RequestMethod.GET)
    @ResponseBody
    public String helloworld(){
        return "Hello World";

    }

    @RequestMapping(value ="/login", method = RequestMethod.GET)
    @ResponseBody
    public String login(){
        return "login";
    }
}