package com.example.eureka_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类 名 称：IndexController.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月05日
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/index")
    @ResponseBody
    public String index(@RequestParam("name") String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
