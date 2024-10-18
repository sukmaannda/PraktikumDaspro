package Praktikum06;
import java.util.Scanner;
public class TokoBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku,hargaPerBuku = 30000;
        double diskon = 0;

        System.out.print("Masukkan hari pembelian: ");
        String hari = sc.nextLine().toLowerCase();

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        if (hari.equals("rabu")) {
            if (jenisBuku.equalsIgnoreCase("Kamus")) {
                hargaPerBuku = 30000;
                diskon = 10; 
                if (jumlahBuku > 2) {
                    diskon += 2; 
                }
            } else if (jenisBuku.equalsIgnoreCase("Novel")) {
                hargaPerBuku = 25000;
                diskon = 7; 
                if (jumlahBuku > 3) {
                    diskon += 2; 
                } else {
                    diskon += 1; 
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = 5; 
                }
            }

            double totalHarga = jumlahBuku * hargaPerBuku;
            double totalDiskon = (diskon / 100 * totalHarga);
            double totalBayar = totalHarga - totalDiskon;
            System.out.println("Total diskon yang didapat adalah: " + diskon + "%");
            System.out.println("Total yang harus dibayar " + totalBayar);
        
        } else {
        System.out.println("Tidak mendapatkan diskon.");
    }
}
}