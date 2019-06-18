package com.paxing.computeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wtzhang (zhangwentao001@lianjia.com)
 * @summary
 * @since 2019-06-18
 */
@RestController
public class ComputeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ComputeController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        int r = a + b;
        LOGGER.info("/add, host:" + serviceInstance.getHost() + ",service_id:" + serviceInstance.getServiceId() + ",result:" + r);
        return r;
    }
}
