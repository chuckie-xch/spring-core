package com.bestcode.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xch
 * @create 2018-03-07 21:01
 **/
@Controller
public class IndexController {

    @RequestMapping("/main")
    public String main() {
        return "main";
    }
}
