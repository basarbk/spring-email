package com.example.email.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

  @Autowired
	JavaMailSender mailSender;

  
  @GetMapping("/test")
	public String send(){
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("basar@mail.com");
		message.setTo("user1@mail.com");
		message.setSubject("subject of the message");
		message.setText("Content of the message");
		mailSender.send(message);
		return "done";
	}

}
