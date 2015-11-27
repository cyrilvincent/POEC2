package com.m2i.formation.tests;

import static org.junit.Assert.*;

import javax.persistence.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.repositories.IRepository;
import com.m2i.formation.media.repositories.MediaRepository;

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
	
	@Test
	public void springTest() {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Media m = (Media)factory.getBean("media");
		assertNotNull(m);
		MediaRepository mr = (MediaRepository)factory.getBean("mediaRepository");
		assertNotNull(mr);
	}

}
