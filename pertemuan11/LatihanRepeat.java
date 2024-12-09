package pertemuan11;

import java.util.Scanner;

public class LatihanRepeat {
	/*
	 * repeat dikenal dengan statement do while pada java,
	 * memiliki karakteristik yang sama dengan while yaitu 
	 * tidak terprediksi pengulangannya.
	 * Tetapi memiliki perbedaan pada letak pengecekan syarat.
	 * Jika while syarat dicek di awal, sedangkan
	 * do while (repeat) pengecekan dilakukan di akhir
	 * 
	 * format :
	 * do{
	 * 	statement berulang 
	 * } while (syarat);
	 * 
	 * contoh kasus
	 * buatlah pengulangan yang terjadi selama menerima inputan 
	 * bukan "selesai"
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String sInput;
		
		System.out.print("Masukan Kata :");
		sInput = sc.next();
		
		do {
			System.out.print("Masukan Kata :");
			sInput = sc.next();
		}while(!sInput.equalsIgnoreCase("selesai"));
	}
}
