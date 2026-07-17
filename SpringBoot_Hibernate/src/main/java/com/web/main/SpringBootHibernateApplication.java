package com.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.web.main.db.DbOperation;
import com.web.main.user.User;

@SpringBootApplication
public class SpringBootHibernateApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =SpringApplication.run(SpringBootHibernateApplication.class, args);
	
	DbOperation obdp = ctx.getBean(DbOperation.class);
	User user = obdp.getUserDetails(1L);
	if(user!= null) {
		System.out.println(user.getName());
		System.out.println(user.getEmail());
	}
	else {
		System.out.println("fail");
	}
	}

}
