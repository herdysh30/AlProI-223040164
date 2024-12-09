package pertemuan13;

import java.util.Scanner;

public class LatihanFungsi {
	/*
	 * fungsi adalah salah satu method yang akan memiliki
	 * return value (mengeluarkan nilai), karena tipedata
	 * yang digunakan adalah tipedata yagn sering kita
	 * gunakan seperti String, Int, Double dkk.
	 * Tipe data yang digunakan pada fungsi, disesuaikan dengan
	 * nilai yang dikeluarkan fungsi tersebut
	 * 
	 * contoh :
	 * 
	 * Buatlah program hitung Body Mass Index dengan spesifikasi berikut :
	 * 1. Terdapat fungsi input nama
	 * 2. Terdapat fungsi hitung BMI dengan input Berat dan tinggi
	 * rumus BMI = berat(kg)/tinggi(meter)"
	 * 3. Tampilkan hasil di main
	 */
	
	static Scanner sc = new Scanner (System.in);
	
	public static String inputNama() {
		String nama;
		System.out.println("Masukan nama anda : ");
		nama = sc.nextLine();
		return nama;
	}
	public static double hitungBMI () {
		double berat, tinggi, bmi;
		System.out.println("Berat anda(kg) : ");
		berat = sc.nextDouble();
		System.out.println("Tinggi anda(meter) : ");
		tinggi = sc.nextDouble();
		
		bmi = berat / (tinggi*tinggi);
		return bmi;
		
	}
	public static void main(String[] args) {
		String outputNama = inputNama();
		double hasilBMI = hitungBMI();
		System.out.println(outputNama + " Memiliki BMI "+ hasilBMI);
	}
}
