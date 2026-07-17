package com.web.main.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	public static SessionFactory getSessionFactory() {
		
		Configuration cfg = new Configuration();
         cfg.configure("/com/web/main/configfile/hibernate.cfg.xml");
         return cfg.buildSessionFactory();
	}

}
