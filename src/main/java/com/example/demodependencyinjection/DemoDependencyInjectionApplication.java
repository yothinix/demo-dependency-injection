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

//		Human humanNew = new Human();
		Human humanNew = context.getBean("human", Human.class);

		System.out.println("human = humanNew :" + (human == humanNew));

		Animal animal1 = context.getBean(Animal.class);
		Animal animal2 = context.getBean(Animal.class);
		System.out.println("animal1 = animal2:" + (animal1 == animal2));
	}

}
