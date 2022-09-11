package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {
	
	@Autowired
	private JavaMailSender javaMailSender;
	public void sendEmail() {
		  System.out.println("in sendEmail method");
		  SimpleMailMessage msg = new SimpleMailMessage(); msg.setTo("shiveshkumar9507575556@gmail.com");
		  //sumit
		  //SimpleMailMessage msg = new SimpleMailMessage(); msg.setTo("sumit.z.kumar@capgemini.com","venkata-naga-sai-hari-krishna.metlapalli@capgemini.com","ankit.c.singhal@capgemini.com","avinash.y.kumar@capgemini.com");
		  msg.setSubject("Order Status Report");
		  msg.setText("Hello \n Test Email");
		  javaMailSender.send(msg);
		  System.out.println("email sent");
		  
		  }

}
