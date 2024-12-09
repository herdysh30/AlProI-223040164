package pertemuan14;

public class buku {
	/*
	 * Ini adalah record buku, dinamakan kelas buku karena akan
	 * menangani nilai dari objek buku
	 * 
	 * atribut adalah nilai-nilai yang dimiliki dari objek
	 * yang akan kita tangani. Karena buku memiliki nilai seperti
	 * judul, penerbit, pengarang, genre, harga dll.
	 * Maka atribut yang ada pada kelas buku mengikuti nilai tersebut,
	 * 
	 * Atribut akan berbentuk variable global dalam kelas record
	 */
	
	String sJudul;
	String sPenerbit;
	String sPenulis;
	int iHarga;
	
	/*
	 * Record harus memiliki method (prosedur atau fungsi) yang digunakan
	 * untuk memasukan nilai ke atribut dan memunculkan nilai dari atribut
	 */
	
	//prosedur input nilai (setter)
	public void inputNilai (String judul, String penerbit, String penulis, int harga) {
		//parameter adalah variable untuk mengirimkan nilai dari pemanggil
		//ke method yang dipanggil
		
		sJudul = judul;
		sPenerbit = penerbit;
		sPenulis = penulis;
		iHarga = harga;
	}
	
	//fungsi pemanggil isi atribut (getter)
	public String getJudul () {
		return sJudul;
	}
	public String getPenerbit () {
		return sPenerbit;
	}
	public String getPenulis () {
		return sPenulis;
	}
	public int getHarga () {
		return iHarga;
	}
}
