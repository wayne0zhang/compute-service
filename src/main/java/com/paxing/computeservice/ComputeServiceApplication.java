package com.paxing.computeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 计算服务:服务提供者
 *
 * @author wtzhang
 * @date 2019-06-18
 */
@EnableEurekaClient
@SpringBootApplication
public class ComputeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputeServiceApplication.class, args);
    }

}
