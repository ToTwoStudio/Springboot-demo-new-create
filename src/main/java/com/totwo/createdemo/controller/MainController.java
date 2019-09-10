package com.totwo.createdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {

    @GetMapping("")
    public String GoIndexPage(Model model , HttpServletRequest response , HttpServletResponse request){

        return "index";
    }

}
