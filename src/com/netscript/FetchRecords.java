package com.netscript;

import org.hibernate.Session;

import java.util.Iterator;
import java.util.List; 

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchRecords {
	public static void main(String[] args) {
		 
		Configuration c = new Configuration();  //creating configuration object 
		c.configure("/hibernate.cfg.xml"); //populates the data of the configuration file 
		SessionFactory sf=c.buildSessionFactory();     //creating seession factory object 
		Session ss = sf.openSession();     //creating seession object 
		Transaction tx = ss.beginTransaction();    //creating transaction  object  
	      try{
	         
	         //List employees = ss.createQuery("FROM Employee").list(); //Employee is pojo name(persistent class)
	    	  List employees = ss.createQuery("SELECT city FROM Employee").list(); 
	    	  System.out.print("SELECT city FROM Employee");
	         for (Iterator iterator = employees.iterator(); iterator.hasNext();)
	         {
	            Employee employee =(Employee) iterator.next(); 
	            //System.out.print(" First Name: " + employee.getFirstName()); 
	           // System.out.print("  Last Name: " + employee.getLastName()); 
	           System.out.println(" City : " + employee.getCity()); 
	            //System.out.print(" Role :" + employee.getRp());
	         }
	         tx.commit();
	      }
	      catch (Exception e)
	      {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }
	      finally 
	      {
	         ss.close(); 
	      }
	}
}
