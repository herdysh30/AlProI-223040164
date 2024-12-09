package pertemuan6;

import java.util.Scanner;

public class LatihanTerneryIF {
	/*
	 * Ternary if adalah bentuk lain dari statement if, dimana
	 * merupakan bentuk singkat dari IF
	 * 
	 * Format :
	 * 
	 * [Tipedata] Variable_penampung = (syarat)? "output TRUE" : "output False"
	 * 
	 * Contoh soal :
	 * 
	 * Buatlah program dengan ternary if, dimana program akan menerima input nilai IPK,
	 * lalu program akan melakukan pengecekan IPK >= 2,75? jika iya maka muncul
	 * "Memenuhi syarat", jika tidak muncul "Mohon maaf"
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sInput = new Scanner (System.in);
		double dIPK;
		
		System.out.print("Masukan IPK anda : ");
		dIPK = sInput.nextDouble();
		
		String hasil = ((dIPK >= 2.75) && (dIPK <= 4.00)) ? "Memenuhi syarat" : "Mohon maaf";
		
		System.out.println(hasil);
	}

}
