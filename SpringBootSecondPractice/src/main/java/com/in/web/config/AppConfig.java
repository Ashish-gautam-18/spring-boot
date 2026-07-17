package com.in.web.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in.web.std.Student;

@Configuration
public class AppConfig {

	 @Bean
	 public CommandLineRunner clr() {
		 return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
			
				std().display();
				 System.out.println("---------------");
				std().display();
				
			}
		};
	 }
	 @Bean
	 public Student std() {
		 return new Student("Ashish" ,01 ,89);
		 
	 }
	 
	
	 @Bean
	 public Student std2() {
		
		 return new Student("Anish" ,02 ,79);
	 }
}
