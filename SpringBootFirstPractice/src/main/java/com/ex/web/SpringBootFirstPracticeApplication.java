package com.ex.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ex.web.commandR.MyClass;

@SpringBootApplication
public class SpringBootFirstPracticeApplication implements CommandLineRunner{

	public static void main(String[] args)  {
		//System.out.println("this is cheak 1");
		SpringApplication.run(SpringBootFirstPracticeApplication.class, args);
		//System.out.println("this is cheak 2");
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		myClass().printMsg("Ashish");
		
	}
     @Bean
	public MyClass myClass() {
		
		return new MyClass();
	}

}
