package com.jspiders.hibernate.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate.hibernate.dto.StudentDTO;

public class StudentDAO {
	
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		try {
			transaction.rollback();
		} catch (TransactionException e) {
			System.out.println("Transaction is committed.");
		}
	}

	public static void main(String[] args) {

		try {

			openConnection();

			transaction.begin();

			/* Insert operation */

		StudentDTO student = new StudentDTO();
		student.setId(2);
		student.setName("Ajit");
		student.setEmail("ajit@gmail.com");
		student.setContact(8976543210L);
		student.setCity("Mumbai");
		manager.persist(student);
			
			
			/* Select Operation */

//			StudentDTO student = manager.find(StudentDTO.class, 2);
//			System.out.println(student);

			/* Update Operation */
//			StudentDTO student = manager.find
//				(StudentDTO.class, 2);
//			student.setCity("Delhi");
//			
//      		manager.persist(student);

			/* Delete Operation */
//      		
//			StudentDTO student = manager.find(StudentDTO.class, 2);
//			manager.remove(student);
//
			transaction.commit();

		} finally {
			closeConnection();
		}

	}

}
