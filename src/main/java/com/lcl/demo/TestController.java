package com.lcl.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tzh
 * @title: TestController
 * @projectName demo
 * @description: TODO
 * @date 2020/7/25 11:34
 */
@RestController
public class TestController {
    @GetMapping("/")
    public String test(){
        return  "docker test";
    }
}
