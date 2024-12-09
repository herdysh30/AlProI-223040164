package pertemuan5.statementif;

import java.util.Scanner;

public class LatihanIFDuaKemungkinan {
	public static void main(String[] args) {
		/*
		 * Statement IF adalah statement percabangan dengan dua kemungkinan yang akan muncul
		 * formatnya :
		 * if (boolean_expression){
		 * 		//statement yang dieksekusi jika syarat terpenuhi
		 * {
		 * else{
		 * 		//statement yang dieksekusi jika syarat tidak terpenuhi
		 * {
		 * 
		 * Buatlah program yang akan menerima inputan keuboard dengan nilai
		 * bilangan bulat, lalu program akan mengecek apakah nilai tersebut diantara 
		 * nilai 60-100,. Jika iya maka akan muncul statement "anda memenuhi syarat", tetapi
		 * jika tidak maka akan muncul statement "Maaf anda belum beruntung"
		 */
		
		Scanner sc = new Scanner (System.in);
		int nilai;
		System.out.println("Masukan Nilai : ");
		nilai = sc.nextInt();
		
		if ((nilai >= 60) && (nilai <= 100)) {
			System.out.println("anda memenuhi syarat");
		}else {
			System.out.println("Maaf anda belum beruntung");
			}
		System.out.println("Selesai");
	}
}
