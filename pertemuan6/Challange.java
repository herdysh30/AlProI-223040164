package pertemuan6;

import java.util.Scanner;

public class Challange {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner (System.in);
		double nilai;
		
		System.out.println("Masukan nilai anda : ");
		nilai = scanInput.nextDouble();
		
		if ((nilai>=0)&&(nilai<=100)) {
			if (nilai >= 80) {
				System.out.println("A");
			}else if((nilai >=70)&&(nilai<80)){
				System.out.println("AB");
			}else if((nilai >=60)&&(nilai<70)) {
				System.out.println("B");
			}else if ((nilai >= 50)&&(nilai<60)){
				System.out.println("BC");
			}else if ((nilai >=40)&&(nilai<50)) {
				System.out.println("C");
			}else if (nilai<40) {
				System.out.println("Tidak lulus");
			}
			
		}else {
			System.out.println("Ditolak");
		}
		
	}

}
