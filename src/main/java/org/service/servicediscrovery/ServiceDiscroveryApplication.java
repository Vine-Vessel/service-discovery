package org.service.servicediscrovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscroveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscroveryApplication.class, args);
    }

}
