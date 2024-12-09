package com.example;

import com.example.api.JobService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : Alfie
 */
@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
@EnableDubbo
@RestController
public class JobServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobServiceApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @DubboReference(version = "1.0.0", timeout = 30000)
    private JobService jobService;


    @RequestMapping("/hi")
    public String home(@RequestParam String name) {

        return "hi "+jobService.sayHello(name)+",i am from port:" +port;
    }

}
