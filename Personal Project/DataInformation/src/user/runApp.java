/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import dataModel.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nkenta
 */
public class runApp {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("Hibernate.cfg.xml");
        
        // Start section for users data information
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        // User's data informations
        Data data = new Data();
        data.setId(1);
        data.setFirstName("Uchechukwu");
        data.setMiddleName("Ferdinand");
        data.setSurName("Nkenta");
        data.setAge("25");
        data.setEmail("uchenkenta@gmail.com");
        data.setOccupation("Student");
        data.setLocation("Enugu, Nigeria");

        Transaction tr = session.beginTransaction();
        session.save(data);
        // Print out message after information is keyed in
        System.out.println("Success! User's information saved!");
        tr.commit();
        // End session
        session.close();
        // End factory
        factory.close();
    }

}
