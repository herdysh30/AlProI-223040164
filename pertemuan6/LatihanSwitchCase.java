package pertemuan6;

import java.util.Scanner;

public class LatihanSwitchCase {
	
	/*
	 * Switch case adalah statement lain dalam struktur kontrol percabangan
	 * dimana digunakna untuk pengkondisian yang terurut seperti menu
	 * 
	 * format :
	 * switch (Variabel_dicek){
	 * 		case a : //syarat a
	 * 				break;
	 * 		case b : //syarat b
	 * 				break;
	 * 		...
	 * 		case n : //syarat n
	 * 				break;
	 * 		default : //jika inputan tidak dikenali
	 * 				break;
	 * }
	 * 
	 * contoh :
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int input;
		System.out.println("Silahkan pilih menu :\n"
				+" 1. Paket Internet\n"
				+" 2. Paket Sosmed\n"
				+" 3. Paket Telp/sms");
		
		System.out.println("Masukan menu yang anda pilih :");
		input = sc.nextInt();
		
		switch(input) {
		case 1 : System.out.println("Masuk Paket internet"); break;
		case 2 : System.out.println("Masuk Paket sosmed"); break;
		case 3 : System.out.println("Masuk Paket Telp/sms"); break;
		default : System.out.println("Input tidak dikenali"); break;
		}
		
		
	}
}
