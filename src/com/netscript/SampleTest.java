package com.netscript;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SampleTest {

	public static void main(String[] args) {
		
		Configuration c = new Configuration(); // create Configuration class.Configuration object parses and reads .cfg.xml file
		c.configure("/hibernate.cfg.xml"); 
		
		SessionFactory sf=c.buildSessionFactory(); // SessionFactory holds cfg file properties like driver props and hibernate props and mapping file
		
		Session s = sf.openSession(); // create one session means Connection 
	
		Transaction tx = s.beginTransaction(); // before starting save(),update(), delete() operation we need to start TX
        										// starting tx mean con.setAutoCommit(false);
		
		List<Employee> list = new ArrayList<Employee>();

		try{
	     
			Employee em=new Employee();//pojo object1
	 		em.setFirstName("Anushaa");
	 		em.setLastName("Gaba");
	 		em.setCity("Kurukshetra");
	 		RolePojo role=new RolePojo();
	 		role.setRolename("HR");
	 		em.setRp(role);
	 		role.setEmployee(em);
	 		
	 		Employee em1=new Employee();//pojo object2
	 		em1.setFirstName("Harman");
	 		em1.setLastName("Kaur");
	 		em1.setCity("Kurukshetra");
	 		RolePojo role1=new RolePojo();
	 		role1.setRolename("HR2");
	 		em1.setRp(role1);
	 		role1.setEmployee(em1);
	 		
	 		Employee em2=new Employee();//pojo object3
	 		em2.setFirstName("poonam11");
	 		em2.setLastName("lather");
	 		em2.setCity("Karnal");
	 		RolePojo role3=new RolePojo();
	 		role3.setRolename("Sales");
	 		em2.setRp(role3);
	 		role3.setEmployee(em2);
	 		
	 		Employee em3=new Employee();//pojo object4
	 		em3.setFirstName("Bharti12");
	 		em3.setLastName("Budhiraja");
	 		em3.setCity("Kurukshetra");
	 		RolePojo role4=new RolePojo();
	 		role4.setRolename("Sale2");
	 		em3.setRp(role4);
	 		role4.setEmployee(em3);
	 		
	 		list.add(em);
	 		list.add(em1);
	 		list.add(em2);
	 		list.add(em3);
	 		
	 		for(Employee emprole:list)
	 		{
	 			s.save(emprole);
	 			//s.persist(emprole);
	 		}
	 		
	 		/*//list of database records
	 		Criteria cr = s.createCriteria(Employee.class);
			List results = cr.list();
			System.out.print(results);*/
	 		
	 		//s.flush();	// stmt.executeBatch()
	 		tx.commit(); // con.commit();
	 		s.close();
	 		System.out.println("Records inserted");
	 		
	 		
		}
		catch(Exception e)
	    {
	      tx.rollback();// con.rollback();
	    }
	}
		
	}

