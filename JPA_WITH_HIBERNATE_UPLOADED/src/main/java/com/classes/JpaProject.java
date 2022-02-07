package com.classes;
import javax.persistence.*;
public class JpaProject {
 public static void main(String[] args) {
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("CustomerObject");
	 EntityManager em = emf.createEntityManager();
	 em.getTransaction().begin();
	 CustomerObject co = new CustomerObject();
	 co.setCustbalance(10000);
	 co.setCustId(100);
	 co.setCustName("VINAYAK");
	 em.persist(co);
	 em.getTransaction().commit();
	 em.close();
	 emf.close(); 
	 
}
}
