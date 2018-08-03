package view;

import org.hibernate.Session;

import controller.hibernateutil;
import model.alunos;

/**
 * Hello world!
 *
 */
public class app 
{
    public static void main( String[] args )
    {
    	alunos alunos = new alunos();
    	alunos.setNome("Jeferson");
    	alunos.setEndereco("Av. Àguia de Háia");
		
		Session session = hibernateutil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(alunos);
		session.getTransaction().commit();

    }
}