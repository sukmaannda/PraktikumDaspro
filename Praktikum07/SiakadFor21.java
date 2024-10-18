package Praktikum07;
import java.util.Locale;
import java.util.Scanner;
public class SiakadFor21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        double tidakLulus = 60.0;

        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= tidakLulus) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("Nilai tertinggi " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Mahasiswa tidak lulus: " + jumlahTidakLulus);
    }
}
