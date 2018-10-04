package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
<<<<<<< HEAD
	
	private HibernateUtil() {}
	
=======

	private HibernateUtil() {
	}

>>>>>>> e37643065f21cabad3351542b86060612be16367
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			sessionFactory = cfg.configure().buildSessionFactory();
		}
		return sessionFactory;
	}
}
