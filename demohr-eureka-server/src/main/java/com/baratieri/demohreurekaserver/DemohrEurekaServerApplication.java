package com.baratieri.demohreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class DemohrEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohrEurekaServerApplication.class, args);
	}

}
