package com.STI.bootcamp.Rekening.db;

import java.util.ArrayList;
import java.util.List;

import com.STI.bootcamp.Rekening.db.model.Rekening;


public class RekeningDaoDummy implements RekeningDao {

	List<Rekening> listRekening = new ArrayList<Rekening>();
	
	@Override
	public void insert(Rekening rekening) {
		// TODO Auto-generated method stub
		listRekening.add(rekening);
	}

	@Override
	public List<Rekening> readAll() {
		// TODO Auto-generated method stub
		return listRekening;
	}

	@Override
	public Rekening findByNoRekening(String noRekening) {
		// TODO Auto-generated method stub
		for (int i = 0; i < listRekening.size(); i++) {
			if(noRekening.equalsIgnoreCase(listRekening.get(i).getNoRekening()));
			return listRekening.get(i);
		}
		return null;
	}
}
