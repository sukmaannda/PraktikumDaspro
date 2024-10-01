package Praktikum05;
import java.util.Scanner;
public class LatihanIndividu3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan pilihan jenis kendaraan
        System.out.println("Jenis kendaraan yang akan diparkir:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        // Variabel untuk menyimpan biaya per jam
        int biayaPerJam = 0;
        String jenisKendaraan = "";

        // Menentukan biaya parkir berdasarkan jenis kendaraan
        switch (pilihan) {
            case 1:
                biayaPerJam = 5000;
                jenisKendaraan = "Mobil";
                break;
            case 2:
                biayaPerJam = 3000;
                jenisKendaraan = "Motor";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return; // Menghentikan program jika pilihan tidak valid
        }

        // Meminta input waktu parkir dalam jam
        System.out.print("Berapa jam kendaraan diparkir? ");
        int jam = scanner.nextInt();

        // Menghitung total biaya
        int totalBiaya = biayaPerJam * jam;

        // Menampilkan hasil
        System.out.println("Jenis kendaraan: " + jenisKendaraan);
        System.out.println("Total biaya parkir untuk " + jam + " jam adalah Rp" + totalBiaya);
        
        scanner.close();
    }
}
