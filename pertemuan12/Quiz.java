package pertemuan12;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int loop;

	for (int bar=1; bar <=4; bar++) {
		for (int kol=1; kol<=bar; kol++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
}
