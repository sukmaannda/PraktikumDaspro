package Praktikum03;
import java.util.Scanner;

public class Segitiga21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas;
        int tinggi;
        float luas;

        System.out.println("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas segitiga: " + luas);
        
    }
    
}
