package com.gestionalePensione;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class GestionalePensioneApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionalePensioneApplication.class, args);
	}

}
