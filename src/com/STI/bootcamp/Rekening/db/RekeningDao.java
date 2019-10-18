package com.STI.bootcamp.Rekening.db;

import java.util.List;

import com.STI.bootcamp.Rekening.db.model.Rekening;

public interface RekeningDao {
	
	void insert(Rekening rekening);
	List<Rekening> readAll();
	Rekening findByNoRekening(String noRekening);

}
