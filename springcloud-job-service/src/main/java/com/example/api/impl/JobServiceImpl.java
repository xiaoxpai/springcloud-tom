package com.example.api.impl;

import com.example.api.JobService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @Author : Alfie
 */
@DubboService(version = "1.0.0", timeout = 30000)
public class JobServiceImpl implements JobService {
    @Override
    public String sayHello(String name) {
        System.err.println("Hello " + name + ", request from consumer: " + RpcContext.getCurrentServiceContext().getRemoteAddress());
        return "Hello " + name;
    }
}
