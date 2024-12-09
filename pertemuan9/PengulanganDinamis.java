package pertemuan9;

import java.util.Scanner;

public class PengulanganDinamis {
	/*
	 * Contoh soal
	 * Buatlah program pengulangan terukur positif, dimana
	 * nilai awal pengulangan adalah 1. dan nilai akhir 
	 * pengulagnan adalah nilai yang diinput user.
	 * 
	 * note : pengulangan positif adalah pengulangan yang 
	 * nilai awal < dari nilai akhir, sehingga pengubahnya +
	 * 
	 * pengulangan negatif adalah pengulangan yang 
	 * nilai awal > nilai akhir, sehingga pengubahnya -
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int akhir,awal;
		String nama;
		System.out.println("masukan nama :");
		nama = sc.next();
		System.out.println("masukan nilai awal");
		awal = sc.nextInt();
		System.out.print("Masukan nilai akhir :");
		akhir = sc.nextInt();
		for (; awal <= akhir;awal++) {
			System.out.println(nama + awal);
		}
		
	}

}
