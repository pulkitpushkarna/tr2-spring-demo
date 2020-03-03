package com.springframework.tr2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Tr2DemoApplication {


	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Tr2DemoApplication.class, args);
		Restaurant restaurant = applicationContext.getBean(Restaurant.class);
		restaurant.getHotDrink().prepareDrink();
	}

}
