package Praktikum03;
import java.util.Scanner;

public class Bank21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tabunganAwal;
        double tabunganAkhir;
        double bunga;
        double persentaseBunga;
        int lamaMenabung;

        persentaseBunga = 0.0002;

        System.out.println("Masukkan jumlah tabungan awal: ");
        tabunganAwal = sc.nextDouble();
        System.out.println("Masukkan lama menabung (bulan): ");
        lamaMenabung = sc.nextInt();

        bunga = persentaseBunga * lamaMenabung * tabunganAwal;
        tabunganAkhir = tabunganAwal + bunga;

        System.out.println("Bunga " + bunga);
        System.out.println("Tabungan akhir: " + tabunganAkhir);
    }
}
