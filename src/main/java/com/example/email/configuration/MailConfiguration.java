package com.example.email.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfiguration {

  @Bean
  JavaMailSender mailSender(){
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    mailSender.setHost("smtp.ethereal.email");
    mailSender.setPort(587);
    mailSender.setUsername("lizeth.rempel2@ethereal.email");
    mailSender.setPassword("tqTKwbKmnc1y7RAJ3F");

    Properties props = mailSender.getJavaMailProperties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.debug", "true");
    return mailSender;
  }
  
}
