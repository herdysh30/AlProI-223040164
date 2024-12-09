package pertemuan13;

import java.util.Scanner;

public class LatihanMethod {
	/*
	 * Method yang dikenal dengan prosedur atau fungsi adalah sebuah subprogram 
	 * yang merupakan bagian dari program yang dituliskan di dalam class, 
	 * tetapi di luar main program
	 * 
	 * secara format method memiliki penulisan yang mirip dengan main, yaitu :
	 * 
	 * public static [tipedata] [namaMethod] (parameter){
	 * 	//isi method (algoritme)
	 * 	return value; (hanya function)
	 * }
	 * 
	 * tipedata yang digunakan pada method ini yang akan
	 * membedakan yang mana prosedur yang mana function
	 * 
	 * dimana prosedur akan selalu menggunakan tipedata void, 
	 * yang artinya kosong, karena kosong sehingga tidak ada 
	 * return value
	 * contoh prosedur tampil nama :
	 * 
	 * public static void tampilNama(){
	 * 	System.out.println("Nama anda");
	 * }
	 * 
	 * Contoh soalnya
	 * 
	 * Buatlah program yang akana menerima inputan keyboard untuk pengisian
	 * nama, lalu munculkan nama tersebut. dimana program tersebut harus menggunakan prosedur.
	 */

	//bisa dituliskan di sini
	
	public static void main(String[] args) {
		//main program
		tampilNama();
	}
	
	
	public static void tampilNama () {
		Scanner sc = new Scanner (System.in);
		String nama;
		System.out.println("Masukan nama anda :");
		nama = sc.nextLine();
		System.out.println("Selamat Datang, "+nama);
	}
	//bisa dituliskan di sini
	
}
