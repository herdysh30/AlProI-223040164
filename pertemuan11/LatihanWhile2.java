package pertemuan11;

public class LatihanWhile2 {
	/*
	 * Buatlah program menggunakan while dimana pengulangan
	 * akan dilakukan sebanyak 10 kali. Dan tampilkan kata
	 * "Angkatan 2022 jaya jaya jaya: sebanyak pengulangan tersebut
	 */
	public static void main(String[] args) {
		//inisialisasi start (nilai awal)
		int loop = 1;
		
		//syaratnya
		while(loop <= 10) {
			System.out.println(loop +". Angkatan 2022 jaya jaya jaya");
			loop++;//baris pengubah
		}
	}
}
