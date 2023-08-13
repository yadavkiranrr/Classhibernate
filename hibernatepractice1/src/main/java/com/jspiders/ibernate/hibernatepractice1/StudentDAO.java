package com.jspiders.ibernate.hibernatepractice1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

public class StudentDAO {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("student");
		
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		
		entitytransaction.begin();
		
		StudentDTO student=new StudentDTO();
		student.setId(1);
		student.setName("Kiran");
		student.setEmail("kiran@gmail.com");
		student.setContact("55668899");
	
		entitymanager.persist(student);
		entitytransaction.commit();
		entitymanagerfactory.close();
		entitymanager.close();
		
		try {
			
			entitytransaction.rollback();
			
		} catch (TransactionException e) {
			// TODO: handle exception
			
			System.out.println("Transaction is commited");
		}
	}

}
