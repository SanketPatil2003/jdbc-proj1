package controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Employee e1=new Employee();
//		e1.setEmp_id(1);
//		e1.setEmp_name("Sudeep");
//		e1.setPh_no(9665786456l);
//		
//		Employee e2=new Employee();
//		e2.setEmp_id(2);
//		e2.setEmp_name("Sanket");
//		e2.setPh_no(9353464678l);
//		
//		et.begin();
//		em.persist(e1);
//		em.persist(e2);
//		et.commit();
//		System.out.println("values inserted");
		
		//update
//		Employee e3=em.find(Employee.class,1);
//		e3.setEmp_name("Kiran");
//		et.begin();
//		em.persist(e3);
//		et.commit();
//		System.out.println("values updated");
		
		//fetch
//		Employee e4=em.find(Employee.class, 2);
//		System.out.println(e4.getEmp_id()+" "+e4.getEmp_name()+" "+e4.getPh_no());
//		et.begin();
//		em.persist(e4);
//		et.commit();
		
		//Delete
		Employee e5=em.find(Employee.class, 1);
		et.begin();
		em.remove(e5);
		et.commit();
		System.out.println("value deleted");
	}

}
