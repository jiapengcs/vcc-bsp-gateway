package com.jiapengcs.vcc.bsp.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2018/11/13
 */
@RestController
public class ConfigController {

    private static final Logger logger = LoggerFactory.getLogger(ConfigController.class);

    @Resource
    private Config config;
    @Resource
    private HttpServletRequest request;

    @RequestMapping("/admin")
    public String admin() {
        logger.info("request from: " + request.getRemoteAddr());
        return "Config data: " + config;
    }
}
