package pertemuan6;

import java.util.Scanner;

public class LatihanNestedIF {
	/*
	 * Nested if adalah bentuk percabangan dengans tatement if,
	 * dimana akan ada if (child) di dalam if lainnya (Parentnya)
	 * 
	 * formatnya :
	 * if (syarat 1) {
	 * 	//jika memenuhi syarat1
	 * 	if (syarat a) {
	 * 		//jika memenuhi syarat a
	 * 	} else if (syarat b) {
	 * 		//Jika memenuhi syarat b
	 * 	} ... //hingga syarat ke-...
	 * 
	 * }else{
	 * 	//Jika tidak memenuhi syarat1
	 * }
	 * 
	 * contoh soal
	 * Buatlah program penerimaan siswa di TK Motekar, dimana program akan
	 * menerima inputan usia anak. Terdapat syarat yaitu :
	 * 1. Anaka yang diterima adalah siswa yang memeiliki umur 5-7 tahun, jika
	 * iya maka akan ada syarat berikutnya
	 * a. Jika anak berumur 5 tahun, maka akan munecul "Kelas A"
	 * b. Jika anak berumur 6-7 tahun, maka akan muncul "Kelas B"
	 * 
	 * 2. Selain umur 5-7 tahun maka akan ditolak
	 */
	
	public static void main(String[] args) {
		Scanner scanInput = new Scanner (System.in);
		int umur;
		
		System.out.println("Masukan umur anak :");
		umur = scanInput.nextInt();
		
		if ((umur >= 5) && (umur <= 7)) {
			
			System.out.println("Diterima");
			if (umur == 5) {
				System.out.println("Masuk Kelas A");
			}else {
				System.out.println("Masuk kelas B");
			}
			
		} else {
			System.out.println("Ditolak");
		}
	}

}
