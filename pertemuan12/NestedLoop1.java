package pertemuan12;

public class NestedLoop1 {
	/*
	 * Buatlah program yang menghasilkan output sebagai berikut
	 * 
	 * *****
	 * *****
	 * *****
	 * *****
	 * *****
	 */
	public static void main(String[] args) {
		for (int bar=1; bar <=5; bar++) {
			for (int kol=1; kol <= 5; kol++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
