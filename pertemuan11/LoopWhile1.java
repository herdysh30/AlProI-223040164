package pertemuan11;

import java.util.Scanner;

public class LoopWhile1 {
	/*
	 * loop while adalah statement pengulangan yang tidak terprediksi
	 * jumlah pengulangannya. 
	 * Hal ini disebabkan karena dalam penulisannya, hanya menuliskan
	 * syarat pengulangan
	 * 
	 * format while :
	 * while (syarat) {
	 * 	statement yang berulang 
	 * }
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
		
		while (!sInput.equalsIgnoreCase("selesai")) {
			// ! artinya bukan atau (not)
			System.out.print("Masukan Kata :");
			sInput = sc.next();
		}
				
		
}
}
