package uts;
import java.util.Scanner;

public class segitiga {
    double alas, tinggi;

    void BacaSegitiga() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai alas: ");
        alas = input.nextDouble();

        System.out.print("Masukkan nilai tinggi: ");
        tinggi = input.nextDouble();
    }

    void TulisSegitiga() {
        System.out.println("Alas: " + alas + ", Tinggi: " + tinggi);
    }

    double Luas() {
        return 0.5 * alas * tinggi;
    }
}
