package com.m2i.formation.media.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.m2i.formation.media.entities.Media;

public class MediaRepository implements IUoW, IRepository<Media> {

	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public void setEntityManager(EntityManager em) {
		this.entityManager = em;
	}

	private EntityTransaction transaction;
	
	@Override
	public EntityTransaction getTransaction() {
		return transaction;
	}

	@Override
	public void setTransaction(EntityTransaction et) {
		this.transaction = et;
	}

	@Override
	public void commit() {
		getTransaction().commit();
	}

	@Override
	public List<Media> getAll() {
		Query query = getEntityManager().createQuery("select e from Media e");
		@SuppressWarnings("unchecked")
		List<Media> l = (List<Media>)query.getResultList();
		return l;
	}

	@Override
	public Media getById(int id) {
		return getEntityManager().find(Media.class, id);
	}

	@Override
	public Media update(Media entity) {
		return getEntityManager().merge(entity);
	}

	@Override
	public void remove(Media entity) {
		getEntityManager().remove(entity);
	}

	@Override
	public Media save(Media entity) {
		getEntityManager().persist(entity);
		return entity;
	}

}
