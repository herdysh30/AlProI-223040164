package pertemuan14;

import java.util.Scanner;

public class LatihanRecord {
	
	/*
	 * Record adalah struktur data, yang akan memungkinkan program
	 * mengelola banyak nilai. Tetapi nilai tersebut saling
	 * mengikat.
	 * Contohnya nrp akan terikat pada suatu nama mahasiswa saja, 
	 * nilai lainnya seperti ipk, semester dll
	 * 
	 * Dimana dalam pembuatannya, record dalam java mengharuskan kita
	 * membuat kelas baru dituliskan tanpa main method
	 * (tanpa public static void main)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//[Nama Kelas] [alias] = new [Nama Kelas]();
		buku bk = new buku ();
		bk.inputNilai("Harry Potter", "Gramedia", "JK Rowling", 300_000);
		System.out.println("Judul Buku : " + bk.getJudul());
		System.out.println("Penerbit : " + bk.getPenerbit());
		System.out.println("Penulis : " + bk.getPenulis());
		System.out.println("Harga : " + bk.getHarga());
		
		buku bk2 = new buku ();
		System.out.print("Masukan judul : ");
		String judul = sc.nextLine();
		System.out.print("Masukan penerbit : ");
		String penerbit = sc.nextLine();
		System.out.print("Masukan penulis : ");
		String penulis = sc.nextLine();
		System.out.print("Masukan harga : ");
		int harga = sc.nextInt();
		
		bk2.inputNilai(judul, penerbit, penulis, harga);
		System.out.println("Judul Buku : " + bk2.getJudul());
		System.out.println("Penerbit : " + bk2.getPenerbit());
		System.out.println("Penulis : " + bk2.getPenulis());
		System.out.println("Harga : " + bk2.getHarga());
				
	}

}
