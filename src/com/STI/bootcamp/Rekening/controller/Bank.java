package com.STI.bootcamp.Rekening.controller;

import java.util.ArrayList;
import java.util.List;

import com.STI.bootcamp.Rekening.db.RekeningDao;
import com.STI.bootcamp.Rekening.db.model.Rekening;

public class Bank {
	
	private RekeningDao dao;

	public Bank(RekeningDao dao) {
		super();
		this.dao = dao;
	}
	
	public void tambahRekening(Rekening rekening) {
		dao.insert(rekening);
	}
	
	public List<Rekening> cariRekening(String noRekening) {
		List<Rekening> temp = new ArrayList<Rekening>();
		for (Rekening Rekening : dao.readAll()) {
			if(Rekening.getNoRekening().contains(noRekening))
			temp.add(Rekening);
		}
		return temp;
	}
	
	public Rekening ambilNoRekening(String noRekening) {
		return dao.findByNoRekening(noRekening);
	}
	
	public List<Rekening> lisRekenings() {
		return dao.readAll();
	}
}
