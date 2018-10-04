package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			sessionFactory = cfg.configure().buildSessionFactory();
		}
		return sessionFactory;
	}
}
