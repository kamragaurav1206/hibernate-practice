package org.yash;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println(sessionFactory);
        Session session = sessionFactory.openSession();
        Student st = new Student(101,"gaurav","gk@gmail.com");
        Transaction transaction = session.beginTransaction();
        session.save(st);
        transaction.commit();
        session.close();
    }
}
