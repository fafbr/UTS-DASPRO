import java.util.Scanner;

public class ZonaDenyutJantung10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan usia Anda: ");
    int usia = sc.nextInt();
    
    System.out.print("Masukkan detak jantung Anda saat latihan (HR): ");
    int hr = sc.nextInt();

    if (usia < 10 || usia > 100 || hr <= 0) {
        System.out.println("Input tidak valid.");
        System.out.println("Pastikan usia masuk akal (10-100) dan HR positif.");
    } else { 
        int mhr = 220 - usia;

        double persenMHR = ((double) hr / mhr) * 100;
            
        int persenMHRBulat = (int) Math.round(persenMHR);

        String kategori = "";
        String saran = "";

        if (persenMHR < 50) {
                kategori = "Sangat ringan";
                saran = "Pemanasan, manfaat minimal.";
        } else if (persenMHR < 60) { // 50% - 59.9...%
                kategori = "Ringan";
                saran = "Peningkatan dasar kebugaran.";
        } else if (persenMHR < 70) { // 60% - 69.9...%
                kategori = "Sedang";
                saran = "Zona aerobik nyaman.";
        } else if (persenMHR <= 85) { // 70% - 85%
                kategori = "Kuat";
                saran = "Meningkatkan kapasitas kardiorespirasi.";
        } else { // Di atas 85%
                kategori = "Sangat berat";
                saran = "Berisiko bagi pemula, batasi durasi.";
        }

        System.out.println("\n--- Hasil Analisis ---");
        System.out.println("Detak Jantung Maksimal (MHR) Anda: " + mhr + " bpm");
        System.out.println("Persentase MHR saat ini: " + persenMHRBulat + "%");
        System.out.println("Kategori Intensitas: " + kategori);
        System.out.println("Saran: " + saran);
        }
    sc.close();
    }
}
