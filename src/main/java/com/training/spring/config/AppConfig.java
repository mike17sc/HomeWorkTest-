package com.training.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.viralpatel.spring")
/**
 * Created by Mschneider on 26-05-17.
 */
public class AppConfig {
}
