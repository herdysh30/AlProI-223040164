package uts;

import java.util.Scanner;

public class soal4 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	double uas, uts, praktikum, tugas, hdr, na;
	String idx;

	System.out.println("Nilai UTS : ");
	uts = input.nextDouble();
	System.out.println("Nilai UAS : ");
	uas = input.nextDouble();
	System.out.println("Nilai Praktikum : ");
	praktikum = input.nextDouble();
	System.out.println("Nilai Tugas : ");
	tugas = input.nextDouble();
	System.out.println("Kehadiran (%) : ");
	hdr = input.nextDouble();

	na = 0.3*uts + 0.3*uas + 0.25*praktikum + 0.15*tugas;

	if (hdr <60){
	idx ="E";
	}else {
	if (na >=85){
	 idx = "A";
	}
	else if (na >=70){
	idx = "B";
	}
	else if(na >=55){
	idx = "C";
	}
	else if(na >=30){
	idx = "D";
	}
	else {
	idx = "E";
	}
	}

	System.out.println("Nilai Akhir : "+na);
	System.out.println("Indeks Nilai : "+idx);
}
}
