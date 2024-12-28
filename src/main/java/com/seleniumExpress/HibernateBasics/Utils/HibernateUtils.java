package com.seleniumExpress.HibernateBasics.Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumExpress.Entity.Passport;
import com.seleniumExpress.Entity.Student;

public class HibernateUtils {

	public static SessionFactory sessionfactory = null;

	public static SessionFactory getSessionFactory() {

		try {
			if (sessionfactory == null) {
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				cfg.addAnnotatedClass(Student.class);
				cfg.addAnnotatedClass(Passport.class);
				sessionfactory = cfg.buildSessionFactory();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Session factory can't be created");
		}

		return sessionfactory;
	}
}
