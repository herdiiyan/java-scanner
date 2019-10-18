package com.STI.bootcamp.Rekening.db.model;

public class Rekening {
		
	private String noRekening;
	private String jenisRekening;
	private String tanggalBuka;
	private String saldo;
	Nasabah nasabah;
	public Rekening(String noRekening, String jenisRekening, String tanggalBuka, String saldo, Nasabah nasabah) {
		
		this.noRekening = noRekening;
		this.jenisRekening = jenisRekening;
		this.tanggalBuka = tanggalBuka;
		this.saldo = saldo;
		this.nasabah = nasabah;
	}
	
	public Nasabah getNasabah() {
		return nasabah;
	}

	public void setNasabah(Nasabah nasabah) {
		this.nasabah = nasabah;
	}

	public String getNoRekening() {
		return noRekening;
	}
	
	public void setNoRekening(String noRekening) {
		this.noRekening = noRekening;
	}
	
	public String getJenisRekening() {
		return jenisRekening;
	}
	
	public void setJenisRekening(String jenisRekening) {
		this.jenisRekening = jenisRekening;
	}
	
	public String getTanggalBuka() {
		return tanggalBuka;
	}
	
	public void setTanggalBuka(String tanggalBuka) {
		this.tanggalBuka = tanggalBuka;
	}
	
	public String getSaldo() {
		return saldo;
	}
	
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "\n Nomor Rekening : "+ this.noRekening+ "\n Jenis Rekening : "+this.jenisRekening+"\n Tanggal Buat : "+this.tanggalBuka+"\n Saldo : "+this.saldo+"\n Id - Nasabah "+this.nasabah + "\n =============";
	}
}
