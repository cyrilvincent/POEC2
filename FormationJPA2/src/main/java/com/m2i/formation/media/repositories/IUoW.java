package com.m2i.formation.media.repositories;

import javax.persistence.*;

public interface IUoW {

	public abstract EntityManager getEntityManager();
	public abstract void setEntityManager(EntityManager em);
	public abstract EntityTransaction getTransaction();
	public abstract void setTransaction(EntityTransaction et);
	public abstract void commit();
	
}
