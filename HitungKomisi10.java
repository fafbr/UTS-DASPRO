import java.util.Scanner;

public class HitungKomisi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan omzet(Rp): ");
        double omzet = sc.nextDouble();
        
        if (omzet < 0) {
            System.out.println("Omzet tidak boleh negatif");
            return;
        }

        System.out.println("Masukkan rating 1 - 100: ");
        int rating = sc.nextInt();
        
        if (rating < 1 || rating > 100) {
            System.out.println("Rating harus antara 1 sampain 100.");
            return;
        }

        System.out.print("Apakah memiliki sertifikasi (ya/tidak): ");
        String sertifikasi = sc.next().toLowerCase();
        if (!sertifikasi.equals("ya") && !sertifikasi.equals("tidak")) {
            System.out.println("Input sertifikasi harus 'ya' atau 'tidak'.");
            return;
        }

        double persentase = 0;
        if (rating >= 70) {
            if (omzet < 500_000) {
                persentase = 0.05;
            }  else if (omzet < 1_000_000) {
                persentase = 0.02;
            } else {
                persentase = 0.03;
            }

            if (rating >= 90) {
                persentase += 0.01;
            }
        }
        
        double komisi = persentase * omzet;
        double bonus = 0;
        if (rating >= 70 && sertifikasi.equals("ya")) {
            bonus = 500_000;
        }
        
        double total = komisi + bonus;

        System.out.println("\n--- Rincian Komisi ---");
        System.out.printf("Persentase Komisi: %.2f%%\n", persentase * 100);
        System.out.printf("Jumlah Komisi: Rp %.2f\n", komisi);
        System.out.printf("Bonus Sertifikasi: Rp %.2f\n", bonus);
        System.out.printf("Total Komisi: Rp %.2f\n", total);

    }    
}
