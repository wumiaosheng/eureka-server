package com.trtjk.ncos.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaWebApplication {

    public static void  main(String[] args) {
        SpringApplication.run(EurekaWebApplication.class, args);
    }
}
