package com.web.main.db;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import com.web.main.config.HibernateConfig;
import com.web.main.user.User;


@Repository
public class DbOperationImpl implements DbOperation {

	@Override
	public User getUserDetails(long id) {
		
		User user = null;
		try(Session session = HibernateConfig.getSessionFactory().openSession();
			)
		{
		 user = session.get(User.class,1L);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
