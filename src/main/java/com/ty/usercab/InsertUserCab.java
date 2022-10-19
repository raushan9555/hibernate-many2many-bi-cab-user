package com.ty.usercab;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertUserCab {

			public static void main(String[] args) {
				User User1=new User();
				User1.setName("Vikas");
				User1.setEmail("vikash123@gmail.com");
				User1.setPhone(9835356223l);
				User1.setPassword("7523");
				/*User User2=new User();
				User2.setName("Vibhash");
				User2.setEmail("vibhash123@gmail.com");
				User User3=new User();
				User3.setName("Vinod");
				User3.setEmail("vinod123@gmail.com");*/
				Cab Cab1=new Cab();
				Cab1.setName("Swift");
				Cab1.setNumber("KA0523F1");
				List<User>users=new ArrayList<User>();
				users.add(User1);
				Cab1.setUsers(users);
				
				
				List<Cab>Cabs=new ArrayList<Cab>();
				Cabs.add(Cab1);
				//Cabs.add(Cab2);
				
				
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
				System.out.println(emf);
				EntityManager em=emf.createEntityManager();
				EntityTransaction et=em.getTransaction();
				et.begin();
				em.persist(Cab1);
				//em.persist(Cab2);
				//em.persist(Cab3);
				em.persist(User1);
				//em.persist(User2);
				//em.persist(User3);
				et.commit();


	}

}
