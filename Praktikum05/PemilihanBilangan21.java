package Praktikum05;
import java.util.Scanner;

public class PemilihanBilangan21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = scanner.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka" + angka + " termasuk bilangan genap.");
        } else {
            System.out.println("Angka " + angka + " termasuk bilangan " + (angka % 2 == 0 ? "genap" : "ganjil"));
        }
    }
}