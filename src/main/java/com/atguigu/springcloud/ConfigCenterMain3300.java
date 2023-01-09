package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @auther zzyy
 * @create 2020-02-21 17:47
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3300
{
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3300.class, args);
    }

    System.out.println("2");
}
