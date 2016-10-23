package com.samsolutions.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by First on 10/21/2016.
 * Home controller
 */
@Controller
public class HomeController {
    @RequestMapping(path="/", method=GET)
    public String home() {
        return "home";
    }
}
