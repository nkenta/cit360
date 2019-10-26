/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package croft;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import croft.model.Employee;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class CreateData {
	public static void main(String[] args) throws Exception {

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpName("Nkenta Uchechukwu .F.");
		emp.setEmpMobileNos("08036895598");
		emp.setEmpAddress("Enugu, Nigeria");
		session.save(emp);
		tr.commit();
		System.out.println("Insert Successful");
		sessFact.close();
	}

}