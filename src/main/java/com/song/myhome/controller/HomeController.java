package com.song.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping // 접속시 default
    public String index(){
        return "index";
    }

}
