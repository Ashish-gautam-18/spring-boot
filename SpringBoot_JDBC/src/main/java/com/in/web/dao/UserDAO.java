package com.in.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.in.web.entity.User;
import com.in.web.mapper.UserRowMapper;

@Repository
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbc_templet;
	
//	public boolean insertUser (User user) {
//		boolean b = false;
//		try {
//			String s = "insert into user ( name , email , gender , city ) values (?,?,?,?)";
//			int i = jdbc_templet.update(s , user.getName() , user.getEmail(), user.getGender(), user.getCity());
//		
//			if(i >0) {
//				b=true;
//			}else {
//				b=false;
//			}
//		}
//		catch(Exception e) {
//			b=false;
//			e.printStackTrace();
//			
//		}
//		return b;
//	}
	

	
	
//	  public boolean updateUser(User user) {
//		  boolean b1;
//		  try {
//			 
//			String s="update user set name =? , gender =? , city=? where email =?";
//		  
//			int i = jdbc_templet.update(s,  user.getName() , user.getEmail(), user.getGender(), user.getCity());
//			if(i >0) {
//			b1=true;
//		}else {
//			b1=false;
//		}
//	  }
//	   catch(Exception e) {
//	 	b1=false;
//		e.printStackTrace();	
//	  }
//	 return b1;
// }	
	
	
	
	  
	
//	  public boolean deleteUser(String email) {
//		  boolean b1;
//		  try { 
//			String s="delete from user where email =?";
//			int i = jdbc_templet.update(s,email);
//			if(i >0) {
//			b1=true;
//		}else {
//			b1=false;
//		}
//	  }
//	   catch(Exception e) {
//	 	b1=false;
//		e.printStackTrace();	
//	  }
//	 return b1;
// }


//	 <=================== get one data by email from db  ==========================>
	
	
	public User getUserByEmail (String email) {
		String select = "select * from user where email = ?";
		return jdbc_templet.queryForObject(select, new UserRowMapper(), email);
		
	}
	
	
	public List<User> getallUser() {
		String alldata ="select * from user";
		return jdbc_templet.query(alldata, new UserRowMapper());
        
        }

	}
      













