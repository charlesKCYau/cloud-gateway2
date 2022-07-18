package com.yau.cloud.gateway2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableHystrix
public class CloudGateway2Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudGateway2Application.class, args);
	}

}
