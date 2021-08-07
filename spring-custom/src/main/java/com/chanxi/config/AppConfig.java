package com.chanxi.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@ComponentScan("com.chanxi")
@ImportResource("spring.xml")
public class AppConfig {


/*	@Bean
	public ApplicationContext get() {
		return new AnnotationConfigApplicationContext();
	}*/
}
