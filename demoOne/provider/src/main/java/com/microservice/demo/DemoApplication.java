package com.microservice.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ImportResource;


@EnableAutoConfiguration
@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml","classpath:dubbo-consumer.xml"})
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
