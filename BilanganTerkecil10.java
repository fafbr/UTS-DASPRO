import java.util.Scanner;

public class BilanganTerkecil10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int terkecil, a, b, c;

        System.out.println("Masukkan nilai pertama: ");
        a = sc.nextInt();
        System.out.println("Masukkan nilai kedua: ");
        b = sc.nextInt();
        System.out.println("Masukkan nilai ketiga: ");
        c = sc.nextInt();

        terkecil = a;
        if (b < terkecil) terkecil = b;
        if (c < terkecil) terkecil = c;

        System.out.println("Bilangan terkecil adalah: " + terkecil);

        if ((a == terkecil && b == terkecil) || (a == terkecil && c == terkecil) || (b == terkecil && c == terkecil)) {
            System.out.println("Ada beberapa angka yang sama dan merupakan nilai terkecil.");
        }
    }    
}
