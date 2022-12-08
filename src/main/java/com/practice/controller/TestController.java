package com.practice.controller;

import com.practice.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: Jet Ma
 * @Created: 2022-12-08
 */
@Controller
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    private TestService service;

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        logger.info("Hello controller started");
        return service.hello();
    }
}
