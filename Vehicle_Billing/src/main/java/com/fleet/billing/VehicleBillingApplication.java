package com.fleet.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VehicleBillingApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(VehicleBillingApplication.class, args);
	}

}
