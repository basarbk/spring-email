package com.example.email.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties
@Data
public class AppConfiguration {

  String host = "smtp.ethereal.email";

  int port = 587;
  
}
