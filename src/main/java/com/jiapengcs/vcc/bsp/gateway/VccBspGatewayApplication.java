package com.jiapengcs.vcc.bsp.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2018/11/13
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class VccBspGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(VccBspGatewayApplication.class, args);
    }
}
