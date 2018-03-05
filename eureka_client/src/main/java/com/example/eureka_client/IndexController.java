package com.example.eureka_client;

import com.yongle.model.Demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weinh
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/index")
    public String index(@RequestParam("name") String name) {
        return "hi " + name + ",i am from port:" + port;
    }

    @PostMapping("/body")
    public String index(@RequestBody Demo demo) {
        return "hi " + demo + ",i am from port:" + port;
    }
}
