package com.sd.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ApiGatewayApplication {

	public static void main(String[] args) {
		
		log.info(" ApiGatewayApplication started >>>>> ");
		
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
