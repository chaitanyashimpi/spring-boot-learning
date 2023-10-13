package com.cratonik.learnspringframework.helloworld;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructors
// equals, hashcode and toString are automatically created
// Released in JDK 16

record Person (String name, int age, Address address) {};
record Address (String Flat_No, String City) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    String name() {
		return "Chaitanya";
	}

    @Bean
    int age() {
		return 15;
	}

    @Bean
    
    Person person() {
		return new Person("Ravi", 20, new Address("05", "NA Ta wadi"));
	}
    
    @Bean
    Person person2MethodCall() {
		return new Person(name(), age(), address()); //name, age
	}
    
    @Bean
    Person person3Parameters(String name, int age, Address address3) { //name, address, address2
		return new Person(name, age, address3); //name, age
	}
    
    @Bean
    @Primary
    Person person4Parameters(String name, int age, Address address2) { //name, address, address2
		return new Person(name, age, address2); //name, age
	}
    
    @Bean
    Person person5Qualifier(String name, int age, @Qualifier("address3quaifier") Address address2) { //name, address, address2
		return new Person(name, age, address2); //name, age
	}

    @Bean(name = "address2")
    @Primary
    Address address() {
		return new Address("24", "Dondaicha");
	}
    @Bean(name = "address3")
    @Qualifier("address3quaifier")
    Address address3() {
		return new Address("08", "Dhule");
	}
}
