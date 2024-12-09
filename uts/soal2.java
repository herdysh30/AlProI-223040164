package uts;

import java.util.Scanner;

public class soal2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah jam kerja selama satu minggu: ");
    int jKerja = input.nextInt();

    int uNormal = jKerja * 17000;
    int uLembur = 0;

    if (jKerja > 40) {
        int jLembur = jKerja - 40;
        uLembur = jLembur * 20000;
    }

    int totalUpah = uNormal + uLembur;

    System.out.println("Total upah: Rp " + totalUpah);

}
}
