package br.com.apex.escola.mvc.model;

import br.com.apex.escola.mvc.persisten.ArrayListPersistenceBoletim;

public class BoletimDAO {

	ArrayListPersistenceBoletim db;
	
	public BoletimDAO(ArrayListPersistenceBoletim db) {
		this.db = db;
		
	}
	
	public void removeAll() {
		db.remiverAll();
		
	}
	
	public void remove(Integer index) {
		db.remove(index);
		
	}
	public Boletim add(Boletim boletim) {
		return db.add(boletim);
		
	}
	public Boletim get(int index) {
		return db.get(index);
	}
	
}
