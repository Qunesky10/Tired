/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donsoft.configDB;
import com.donsoft.model.Person;
import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Donchi4all
 */
public class AddToDB {
    int i = 0;	
    public static void main(String[] args) {
        new AddToDB().i = 5;
    	

//creating configuration object 
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
//populates the data of the configuration file	
//creating seession factory object 
    SessionFactory factory=cfg.buildSessionFactory();
    //creating session object 
    Session session=factory.openSession();	
//creating transaction object 
    Transaction t=session.beginTransaction(); 
    Person e1=new Person();
   // e1.setId(115);
    e1.setName("chisom"); 
    e1.setCountry("Nigeria");
    session.persist(e1);
//persisting the object
    t.commit();
//transaction is commited 
    session.close(); 
    System.out.println("successfully saved");
}


}
