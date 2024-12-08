



## 微服务环境搭建

版本
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.2.6</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-dependencies</artifactId>
    <version>2021.0.3</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

详细，可查看文件
[.springboot-springcloud.version](.springboot-springcloud.version)



---

### 服务启动

- eureka-client
  - springcloud-job-service
  - springcloud-user-service
- eureka-registry
  - springcloud-tom-eureka

![microservices-dashbord.png](document%2Fmicroservices-dashbord.png)


### 关于分支

- master
  - 项目主分支 后续迭代新特性
- registry
  - 注册中心 分支，该分支用户演示微服务构架：服务发现与服务注册之间的相互通信
- dubbo-zookeeper-registry
  - 改分支演示zookeeper作为注册中心，dubbo服务注册与发现（dubbo-3.x)
  - ![dubbo-admin-service-discovery.png](document%2Fdubbo-admin-service-discovery.png)


### 关于服务注册与发现

![Service registration and discovery.png](document%2FService%20registration%20and%20discovery.png)








# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.0/maven-plugin/build-image.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.0/reference/using/devtools.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

