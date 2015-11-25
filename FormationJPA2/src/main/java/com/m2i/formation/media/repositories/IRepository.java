package com.m2i.formation.media.repositories;

import java.util.List;

public interface IRepository<T> {

	public abstract List<T> getAll();
	public abstract T getById(int id);
	public abstract T update(T entity);
	public abstract void remove(T entity);
	public abstract T save(T entity);
}
