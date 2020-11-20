package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

	public static final String REST_URL="http://www.equifax.com/getScores";

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	//HIS-134 modification
			context.close();
	}

}
