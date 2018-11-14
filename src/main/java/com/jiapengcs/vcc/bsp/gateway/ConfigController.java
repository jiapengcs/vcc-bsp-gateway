package com.jiapengcs.vcc.bsp.gateway;

import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2018/11/13
 */
@RestController
public class ConfigController {

    @Resource
    private Config config;

    @RequestMapping("/admin")
    public String admin() {
        return "Config data: " + config;
    }
}
