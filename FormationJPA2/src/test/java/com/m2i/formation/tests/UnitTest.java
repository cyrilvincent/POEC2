package com.m2i.formation.tests;

import static org.junit.Assert.*;

import javax.persistence.*;

import org.junit.Test;

import com.m2i.formation.media.entities.Media;

public class UnitTest {

	@Test
	public void entityManagerTest() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FormationJPA");
		assertNotNull(emf);
		EntityManager em = emf.createEntityManager();
		assertNotNull(em);
	}
	
	@Test
	public void findTest() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FormationJPA");
		assertNotNull(emf);
		EntityManager em = emf.createEntityManager();
		assertNotNull(em);
		Media m = em.find(Media.class, 1);
		assertNotNull(m);
		
	}

}
