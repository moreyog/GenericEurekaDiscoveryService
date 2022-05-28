package com.s3.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GenericEurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenericEurekaDiscoveryServiceApplication.class, args);
	}

}
