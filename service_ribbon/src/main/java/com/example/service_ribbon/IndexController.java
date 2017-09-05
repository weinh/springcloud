package com.example.service_ribbon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 类 名 称：IndexController.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月05日
 */
@RestController
public class IndexController {

    @Resource
    private IndexService indexService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(@RequestParam("name") String name) {
        return indexService.index(name);
    }
}
