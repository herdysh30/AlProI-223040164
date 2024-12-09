package uts;

import java.util.Scanner;

public class soal3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int umur = sc.nextInt();
	if ((umur >=5) && (umur <=6)){
	System.out.println("Kelompok A");
	}else if (umur == 4){
	System.out.println("Kelompok B");
	}
	else{
	System.out.println("Ditolak");
	}

}
}
