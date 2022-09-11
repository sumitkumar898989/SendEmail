package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SendEmailApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SendEmailApplication.class, args);
		System.out.println("welcome to boot");
		SendEmail a = context.getBean(SendEmail.class);
		a.sendEmail();
	}
	
	  
	 
}
