package com.ws.line.LineBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication()
@Configuration
@PropertySources({ @PropertySource(value = "classpath:config/application.properties", ignoreResourceNotFound = true) })
public class LineBotApplication {

	public static void main(String[] args) {

		SpringApplication.run(LineBotApplication.class, args);
	}
}
