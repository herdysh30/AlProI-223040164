package uts;
public class latihan {
    static void Compare(segitiga S1, segitiga S2) {
        double luasS1 = S1.Luas();
        double luasS2 = S2.Luas();

        if (luasS1 > luasS2) {
            System.out.println("Luas Segitiga S1 lebih besar daripada Luas Segitiga S2");
        } else if (luasS1 < luasS2) {
            System.out.println("Luas Segitiga S2 lebih besar daripada Luas Segitiga S1");
        } else {
            System.out.println("Luas Segitiga S1 sama dengan Luas Segitiga S2");
        }
    }

    public static void main(String[] args) {
        segitiga A = new segitiga();
        System.out.println("Segitiga A");
        A.BacaSegitiga();
        A.TulisSegitiga();
        System.out.println("Luas: " + A.Luas());

        segitiga B = new segitiga();
        System.out.println("Segitiga B");
        B.BacaSegitiga();
        B.TulisSegitiga();
        System.out.println("Luas: " + B.Luas());

        Compare(A, B);
    }
}
