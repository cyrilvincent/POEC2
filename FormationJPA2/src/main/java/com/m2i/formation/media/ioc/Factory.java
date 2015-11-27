package com.m2i.formation.media.ioc;

public class Factory {

	private Factory() {
		// TODO Auto-generated constructor stub
	}
	
	public Object genericFactory(String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return Class.forName(name).newInstance();
	}

}
