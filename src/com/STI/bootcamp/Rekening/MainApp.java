package com.STI.bootcamp.Rekening;

import java.util.Arrays;
import java.util.Scanner;

import com.STI.bootcamp.Rekening.controller.Bank;
import com.STI.bootcamp.Rekening.db.RekeningDao;
import com.STI.bootcamp.Rekening.db.RekeningDaoDummy;
import com.STI.bootcamp.Rekening.db.model.Nasabah;
import com.STI.bootcamp.Rekening.db.model.Rekening;

public class MainApp {

	public static void main(String[] args) {
		
		RekeningDao dao = new RekeningDaoDummy();
		Bank bank = new Bank(dao);
//		
//		System.out.println("List :"+ Arrays.toString(bank.lisRekenings().toArray()));
//		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("1. Tambah Nasabah & Rekening");
			System.out.println("2. Daftar Rekening");
			System.out.println("3. Keluar");
			System.out.println("=============================");
			System.out.println("Masukan Pilihan");
			int menuUser = sc.nextInt();
			if (menuUser == 1) {
				System.out.print("Buat Id Nasabah : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Masukan Nama Nasabah : ");
				String nama = sc.nextLine();
				System.out.print("Tempat Lahir Nasabah : ");
				String tempatLahir = sc.nextLine();
				System.out.print("Tanggal Lahir Nasabah : ");
				String tanggalLahir = sc.nextLine();
				System.out.print("Alamat Nasabah : ");
				String alamat = sc.nextLine();
				System.out.println();
				System.out.println("=================================");
				System.out.println("          BUAT REKENING          ");
				System.out.println("=================================");
				System.out.print("Buat Nomor Rekening : ");
				String noRekening = sc.nextLine();
				System.out.println("       Pilih Jenis Rekening      ");
				System.out.println("| Tabungan | Simpanan | Pinjaman |");
				String jenisRekening = sc.nextLine();
				System.out.print("Tanggal Buka Rekening : ");
				String tanggalBuka = sc.nextLine();
				System.out.print("Masukan Saldo : ");
				String saldo = sc.nextLine();
				System.out.println("=================================");
				Nasabah nasabah = new Nasabah(id, nama, tempatLahir, tanggalLahir, alamat);
				Rekening rekening = new Rekening(noRekening, jenisRekening, tanggalBuka, saldo, nasabah);
				bank.tambahRekening(rekening);
				
			}else if (menuUser == 2) {
				System.out.println("==========================================");
				System.out.println("           List Nasabah Terdaftar         ");
				System.out.println("==========================================");
				System.out.println(Arrays.toString(bank.lisRekenings().toArray()));
				System.out.println("==========================================");
				System.out.println("                Terima Kasih              ");
				System.out.println("==========================================");
				break;
			}else {
				break;
			}
		} while (true);
			
//		
//		System.out.println((bank.lisRekenings().get(0)));
//		 
//		 System.out.println("Masukan");
		
		
//		System.out.println("No Rekening : "+rekening1.getNoRekening());
//		System.out.println("Jenis Rekening : "+rekening1.getJenisRekening());
//		System.out.println("Tanggal Buka : "+rekening1.getTanggalBuka());
//		System.out.println("Saldo : "+rekening1.getSaldo());
//		System.out.println("Nasabah : "+rekening1.getNasabah().getNama()+"-"+rekening1.getNasabah().getIdNasabah());
//		System.out.println("==========================================================");
//		System.out.println("No Rekening : "+rekening2.getNoRekening());
//		System.out.println("Jenis Rekening : "+rekening2.getJenisRekening());
//		System.out.println("Tanggal Buka : "+rekening2.getTanggalBuka());
//		System.out.println("Saldo : "+rekening2.getSaldo());
//		System.out.println("Nasabah : "+rekening2.getNasabah().getNama()+"-"+rekening2.getNasabah().getIdNasabah());
//		System.out.println("==========================================================");
//		System.out.println("No Rekening : "+rekening3.getNoRekening());
//		System.out.println("Jenis Rekening : "+rekening3.getJenisRekening());
//		System.out.println("Tanggal Buka : "+rekening3.getTanggalBuka());
//		System.out.println("Saldo : "+rekening3.getSaldo());
//		System.out.println("Nasabah : "+rekening3.getNasabah().getNama()+"-"+rekening3.getNasabah().getIdNasabah());
//		System.out.println("==========================================================");
//		System.out.println("No Rekening : "+rekening4.getNoRekening());
//		System.out.println("Jenis Rekening : "+rekening4.getJenisRekening());
//		System.out.println("Tanggal Buka : "+rekening4.getTanggalBuka());
//		System.out.println("Saldo : "+rekening4.getSaldo());
//		System.out.println("Nasabah : "+rekening4.getNasabah().getNama()+"-"+rekening4.getNasabah().getIdNasabah());
//		
//		System.out.println(nasabah1.toString());
//		System.out.println();
	}

}
