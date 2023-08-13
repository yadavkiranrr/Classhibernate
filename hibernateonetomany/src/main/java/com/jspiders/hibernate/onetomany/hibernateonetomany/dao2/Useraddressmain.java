package com.jspiders.hibernate.onetomany.hibernateonetomany.dao2;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate.onetomany.hibernateonetomany.dto2.User;
import com.jspiders.hibernate.onetomany.hibernateonetomany.dto2.Useraddress;

public class Useraddressmain {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnections() {
		factory=Persistence.createEntityManagerFactory("OneToMany1");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
			
	}
	
	private static void closeConnections() {
		
		if(factory!=null) {
			factory.close();
		}
		
		if(manager!=null) {
			manager.close();
			
		}
		if(transaction!=null) {
			
			try {
				
			transaction.rollback();	
			
			}
			catch(TransactionException e) {
				
			System.out.println("transaction is commited");
			
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			openConnections();
			transaction.begin();
			
			User user1= new User();
			user1.setUserId(1);
			user1.setUsername("kiran");

			
			Useraddress address=new Useraddress();
			address.setUserId(1);
			address.setUseraddress("vita");
			manager.persist(address);
			
			Useraddress address1=new Useraddress();
			address.setUserId(2);
			address.setUseraddress("vita1");
			manager.persist(address);
			
			
			Useraddress address2=new Useraddress();
			address.setUserId(3);
			address.setUseraddress("vita2");
			manager.persist(address);
			
			
			
			
			List<Useraddress> addresses=
					Arrays.asList(address,address1,address2);
			
			user1.setUseraddress(addresses);
			manager.persist(user1);
			transaction.commit();
			
		}
		finally {
			
			closeConnections();
		}
		
		
		
	}
	

}


