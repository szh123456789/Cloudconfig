package com.boot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args){
        System.out.println(">>>>>>>>>>>>>>> 启动EurekaServer <<<<<<<<<<<<<<<");
        SpringApplication.run(EurekaServerApplication.class, args);
        System.out.println(">>>>>>>>>>>>>>> 运行EurekaServer成功 <<<<<<<<<<<<<<<");
    }
}
