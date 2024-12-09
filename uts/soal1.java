package uts;

import java.util.Scanner;

public class soal1 {
public static void main(String[] args) {
	Scanner scanInput = new Scanner (System.in);
	double beratBadan;
	double tinggiBadan;
	double mTinggi;
	double mmTinggi;
	double mBMI;
	
	System.out.println("Masukan Berat Badan Anda : ");
	beratBadan = scanInput.nextInt();
	
	System.out.println("Masukan Tinggi badan Anda : ");
	tinggiBadan = scanInput.nextDouble();

	mTinggi = (tinggiBadan / 100.0);
	mmTinggi = (mTinggi * mTinggi);
	mBMI = beratBadan / mmTinggi;
	System.out.println(String.format("BMI : %.2f",mBMI));
	if (mBMI < 18.5) {
		System.out.println("Kategori BMI : Berat Badan Kurang");
		}else if ((mBMI >= 18.5) && (mBMI <=24.9)) { 
			System.out.println("Kategori BMI : Berat Badan Normal");
		}else if ((mBMI >=25)&& (mBMI <=29.9)) {
			System.out.println("Kategori BMI :Berat Badan Berlebih");
		}else if (mBMI > 30) {
			System.out.println("Kategori BMI : Obesitas");
		}

	
}
}
