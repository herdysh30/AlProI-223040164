package pertemuan13;

import java.util.Scanner;

public class LatihanMethodPresegiPanjang {
	
	/*
	 * Buatlah program hitung luas persegi panjang dengan 
	 * menggunakan method berdasarkan sepsifikasi berikut :
	 * 1. Terdapat prosedur input panjang dan lebar
	 * 2/ Terdapat prosedur hitung luas dan tampilkan hasil luasnya
	 * 
	 * Terdapat dua macam variable :
	 * 1. Variable lokal, yaitu variabel yang dideklarasikan di dalam 
	 * method (termasuk main), dampaknya variable tersebut tidak akan
	 * dikenali oleh method yang lain
	 * 
	 * 2. Variable global, yaitu variable yang dideklarasikan di dalam class 
	 * tetapi di luar method (termasuk main), sehingga semua method 
	 * di dalam kelas tersebut mengenalinya
	 */
	static int panjang, lebar;
	public static void inputNilai() {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Panjang : ");
		panjang = sc.nextInt();
		System.out.print("Lebar : ");
		lebar = sc.nextInt();
	}
	
	public static void hitungLuas () {
		int luas;
		luas = panjang * lebar;
		System.out.println("Luas = "+ luas);
	}
	public static void main(String[] args) {
		inputNilai();
		hitungLuas();
	}

}
