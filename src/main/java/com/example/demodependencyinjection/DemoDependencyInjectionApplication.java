package com.example.demodependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoDependencyInjectionApplication.class, args);

		Human human = context.getBean("human", Human.class);

		System.out.println(human.getName());
		System.out.println(human.getAnimal().getPetName());
	}

}
