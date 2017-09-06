package com.example.servicefeign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 类 名 称：IndexController.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月07日
 */
@RestController
public class IndexController {

    @Resource
    IndexService indexService;

    @RequestMapping("/index")
    public String index(@RequestParam String name) {
        return indexService.index(name);
    }
}
