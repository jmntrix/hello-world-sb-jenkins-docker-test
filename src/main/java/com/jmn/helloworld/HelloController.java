package com.jmn.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jmn
 * @Date: 24.07.2020
 **/

@RestController
public class HelloController {

    public HelloController() {}

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello Tim2!";
    }

    @RequestMapping(value = "/")
    public String blank() {
        return "hello from docker!";
    }
}
