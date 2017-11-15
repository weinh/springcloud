package com.example.eureka_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weinh
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
