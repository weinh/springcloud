package com.example.servicefeign;

import com.yongle.model.Demo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类 名 称：IndexService.java
 * 功能说明：
 * 开发人员：weinh
 * 开发时间：2017年09月07日
 */
@FeignClient(value = "client", fallback = ServiceHystrix.class)
public interface IndexService {
    @RequestMapping(value = "index")
    String index(@RequestParam(name = "name") String name);

    @PostMapping(value = "body")
    String body(@RequestBody Demo demo);
}
