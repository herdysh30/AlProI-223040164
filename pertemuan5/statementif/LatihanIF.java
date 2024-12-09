package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIF {
	public static void main(String[] args) {
		/*
		 * Statment If adalah statement percabangan dengan satu kemungkinan
		 * yang akan muncul
		 * formatnya :
		 * if (boolean_expression){
		 * 		//statement yang dieksekusi jika syarat terpenuhi
		 * }
		 * 
		 * Buatlah program yang akan menerima inputan keyboard dengan nilai
		 * bilangan bulat, lalu program akan mengecek apakah nilai
		 * tersebut >= 60. Jika iya maka akan muncl statement "anda lulus"
		 */
		
		Scanner sc = new Scanner (System.in);
		int nilai;
		System.out.print("Masukan Nilai : ");
		nilai = sc.nextInt();
		
		if (nilai >= 60){
			System.out.println("anda lulus");
		}
		System.out.println("Selesai");
	}

}
