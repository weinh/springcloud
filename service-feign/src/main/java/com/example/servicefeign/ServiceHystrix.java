package com.example.servicefeign;


import org.springframework.stereotype.Component;

/**
 * 类 名 称：Hystrix.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月07日
 */
@Component
public class ServiceHystrix implements IndexService {

    @Override
    public String index(String name) {
        return "sorry," + name;
    }
}
