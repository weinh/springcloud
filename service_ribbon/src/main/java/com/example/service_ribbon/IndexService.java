package com.example.service_ribbon;

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

    public String index(String name) {
        return restTemplate.getForObject("http://CLIENT/index?name=" + name, String.class);
    }
}
