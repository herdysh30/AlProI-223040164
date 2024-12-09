package pertemuan2;

import java.util.Scanner;

public class LatihanScanner {
	
	public static void main (String [] args) {
		/*
		 * Scanner adalah salah satu fungsi input keyboard
		 * dimana fungsinya akan menyesuaikan dengan tipedata 
		 * yang digunakan
		 * 
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Nama :");
		String sNama = sc.next();//next() untuk String
		
		System.out.print("Umur :");
		int iUmur = sc.nextInt();//nextInt() untuk int
		
		System.out.print("IPK :");
		double dIPK = sc.nextDouble();//nextDouble untuk double
		
		System.out.println("Nama saya " + sNama + " Berumur " + iUmur + " Tahun, memiliki ipk " + dIPK);
	}

}
