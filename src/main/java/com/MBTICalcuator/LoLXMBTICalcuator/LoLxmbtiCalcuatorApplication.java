package com.MBTICalcuator.LoLXMBTICalcuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LoLxmbtiCalcuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoLxmbtiCalcuatorApplication.class, args);
	}

}
