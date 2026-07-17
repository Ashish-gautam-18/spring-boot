package com.in.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.in.web.dao.UserDAO;
import com.in.web.entity.User;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Autowired
	private UserDAO userDao;
	
    public void run(String... args) throws Exception {
		
    	
 //     <======================== Insertion data in Db ===============================>
    	
//		User user1 = new User ("Ashish" , "ashi123@gmail.com" , "male", "GKP");
//		boolean a = userDao.insertUser(user1);
//		User user1 = new User ("Anish" , "anni111@gmail.com" , "male", "Praygraaj");
//		boolean a = userDao.insertUser(user1);	
//		User user3= new User ("jyoti" , "jyoti789@gmail.com" , "female", "Raipur");
//		boolean a = userDao.insertUser(user3);
		
//		if(a) {
//			System.out.println(" THANKS :  data instertion are successfull..");
//		}else {
//			System.out.println("ERROR : somthing error due to user input..");
//		}
	
    	
    	
//      <=============================== updation data ==============================>    	
    	
    	
//    	   User user = new User("Ashish","male","Gorakhpur"  , "ashi123@gmail.com");
//    	   boolean status = userDao.updateUser(user);
//   		
//   		if(status) {
//   			System.out.println(" THANKS :  data Updation is successfull..");
//   		}else {
//   			System.out.println("ERROR : somthing error due to user input..");
//   		}
//	
    	
    	
//           <============================ Deletion ====================================== >    	
    	
//    	
//    	  boolean s = userDao.deleteUser("ashi123@gmail.com");
//    	  if (s) {
//    		  System.out.println("Delete  :  data by email id will deleted..");
//    	  }else {
//    		  System.out.println("Fail  :  something is wrong - due to user input ");
//    	  }

    	  
    	  
//          <====================  Select one  data from db ==============================>  
    	
//    	       User user =userDao.getUserByEmail("jyoti789@gmail.com");
//    	       System.out.println("Name : " +user.getName());
//    	       System.out.println("Email : " +user.getEmail());
//    	       System.out.println("Gender : " +user.getGender());
//    	       System.out.println("City : " +user.getCity());
//    	       
 
    	
    	
//      <====================  Select all  data from db ==============================>  	
    	       
    	       List<User> list =userDao.getallUser();
    	       for (User user : list) {
    	    	   System.out.println("Name : " +user.getName());
        	       System.out.println("Email : " +user.getEmail());
        	       System.out.println("Gender : " +user.getGender());
        	       System.out.println("City : " +user.getCity());
        	       
    	       }
	}

}











