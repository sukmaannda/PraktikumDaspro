package Praktikum05;
import java.util.Scanner;
public class LatihanIndividu4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan usia Anda: ");
        
        if (scanner.hasNextInt()) {
            int usia = scanner.nextInt();
            
            if (usia >= 0) {
                String kategori;

                if (usia <= 12) {
                    kategori = "Anak";
                } else if (usia <= 19) {
                    kategori = "Remaja";
                } else if (usia <= 64) {
                    kategori = "Dewasa";
                } else {
                    kategori = "Lansia";
                }

                System.out.println("Anda termasuk dalam kategori: " + kategori);
            } else {
                System.out.println("Error: Usia tidak boleh negatif.");
            }
        } else {
            System.out.println("Error: Input harus berupa angka positif.");
        }
        scanner.close();
    }
}
