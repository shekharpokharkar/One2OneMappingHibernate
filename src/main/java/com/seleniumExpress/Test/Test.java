package com.seleniumExpress.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seleniumExpress.Entity.Passport;
import com.seleniumExpress.Entity.Student;
import com.seleniumExpress.HibernateBasics.Utils.HibernateUtils;

public class Test {
	public static Session session = null;
	public static Transaction transaction = null;

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		if (sessionFactory != null) {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Student student = session.get(Student.class, 2);
			session.delete(student);
			transaction.commit();

			Passport passport = session.get(Passport.class, 1003);

			session.delete(passport);
			transaction.commit();
			System.out.println("Student+Passport deleted successfully");

			session.close();
		}

	}

}