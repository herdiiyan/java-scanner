package com.STI.bootcamp.Rekening.db.model;


public class Nasabah {
	public Nasabah() {
	
	}
	
	private int idNasabah;
	private String nama;
	private String tempatLahir;
	private String tanggalLahir;
	private String alamat;
	
	public Nasabah(int idNasabah, String nama, String tempatLahir, String tanggalLahir, String alamat) {
		super();
		this.idNasabah = idNasabah;
		this.nama = nama;
		this.tempatLahir = tempatLahir;
		this.tanggalLahir = tanggalLahir;
		this.alamat = alamat;
	}

	public int getIdNasabah() {
		return idNasabah;
	}

	public void setIdNasabah(int idNasabah) {
		this.idNasabah = idNasabah;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTempatLahir() {
		return tempatLahir;
	}

	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public String toString() {
		return "nama Nasabah : "+idNasabah+ " - " +nama;
	}
}
