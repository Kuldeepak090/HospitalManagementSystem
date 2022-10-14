package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	 Configuration con = new Configuration().configure().addAnnotatedClass(Patients.class);
     	 Configuration con1 = new Configuration().configure().addAnnotatedClass(Doctor.class);
     	 Configuration con2 = new Configuration().configure().addAnnotatedClass(Receptionists.class);
         SessionFactory sf=con.buildSessionFactory();
         Session session = sf.openSession();
         
       
         Transaction t=session.beginTransaction();
         
  
	
        t.commit();
        session.close();
         
        System.out.println( "Hello World!" );
    }
}
