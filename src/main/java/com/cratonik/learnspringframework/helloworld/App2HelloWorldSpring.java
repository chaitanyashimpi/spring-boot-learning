package com.cratonik.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2HelloWorldSpring {

	public static void main(String[] args) {
		// 1: Launch a Spring Context
		
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		{
			// 2: Configure the things we want spring to manage 
			// HellowWorldConfiguration - @Configuration
			// name - @Bean
			
			// 3: Retrieving Beans 
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean("person5Qualifier"));
			
			
//			List out all the beans managed by Spring Framework
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
		
		
		
		
		
	}

}
