package com.jiapengcs.vcc.bsp.gateway;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2018/11/13
 */
@Configuration
@ConfigurationProperties(prefix = "vcc.bsp")
public class Config {

    private String admin;

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "ConfigTest{" +
                "admin='" + admin + '\'' +
                '}';
    }
}
