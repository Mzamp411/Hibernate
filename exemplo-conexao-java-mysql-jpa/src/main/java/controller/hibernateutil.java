package controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.alunos;
public class hibernateutil {

	private static final SessionFactory factory = buildSessionFactory();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(alunos.class);
		configuration.configure();
		return configuration.buildSessionFactory();
		// TODO Auto-generated method stub
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}

}
