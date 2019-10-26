/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package croft;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Nkenta Uchechukwu
 */

public class HibernateUtil {
	private static final SessionFactory sessionFactory;

	private static ServiceRegistry serviceRegistry;

	static {

		try {

			Configuration configuration = new Configuration();
			configuration.configure();
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
					configuration.getProperties()).getBootstrapServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		} catch (Throwable th) {

			System.err.println("initial SessionFactory creation failed" + th);

			throw new ExceptionInInitializerError(th);

		}

	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;

	}
}
