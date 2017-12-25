package com.anbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AfilFingerprintDsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfilFingerprintDsApplication.class, args);
	}
}
