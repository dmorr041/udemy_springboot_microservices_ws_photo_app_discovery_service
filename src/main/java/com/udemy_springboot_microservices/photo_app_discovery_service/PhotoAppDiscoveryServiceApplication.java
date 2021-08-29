package com.udemy_springboot_microservices.photo_app_discovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(PhotoAppDiscoveryServiceApplication.class, args);
	}

}
