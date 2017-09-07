package com.example.service_ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 类 名 称：IndexService.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月05日
 */
@Service
public class IndexService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String index(String name) {
        return restTemplate.getForObject("http://CLIENT/index?name=" + name, String.class);
    }

    public String error(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
