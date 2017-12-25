package com.anbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AfilParallelDsFraApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfilParallelDsFraApplication.class, args);
	}
}
