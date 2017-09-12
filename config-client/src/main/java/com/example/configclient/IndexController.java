package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类 名 称：IndexController.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月10日
 */
@RestController
public class IndexController {


    @Value("${foo}")
    public String foo;


    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        return foo;
    }
}
