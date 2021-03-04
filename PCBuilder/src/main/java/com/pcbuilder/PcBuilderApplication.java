package com.pcbuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"com.pcbuilder.entities"})
public class PcBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcBuilderApplication.class, args);
	}
}