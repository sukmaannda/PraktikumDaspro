package Praktikum07;
import java.util.Scanner;
public class Bioskop21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;
        int hargaTiket = 50000; 

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan (ketik 0 untuk berhenti): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan jumlah tiket yang benar dan coba lagi.");
                continue; 
            } if (jumlahTiket == 0) {
                break;
            }

            double hargaPembelian = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                hargaPembelian *= 0.85; 
            } else if (jumlahTiket > 4) {
                hargaPembelian *= 0.90; 
            }

            totalTiket += jumlahTiket;
            totalPenjualan += hargaPembelian;
            System.out.println("Total harga untuk pelanggan ini: Rp. " + hargaPembelian);
            sc.nextLine(); 
    
        } while (jumlahTiket != 1);

        System.out.println("Total tiket yang telah terjual: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp. " + totalPenjualan);
    }
}