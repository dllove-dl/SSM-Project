package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/**
 * 测试前后端连通
 * path:localhost:8080/SSM/Test.ac
 */
public class MyController {
    @RequestMapping("Test.ac")
    public String webTest(){
        return "Test";
    }
}
