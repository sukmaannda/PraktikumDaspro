package Praktikum06;
import java.util.Scanner;
public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1, bil2, bil3, hasil;

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        bil2 = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = input.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                hasil = bil1;
            } else {
                hasil = bil3;
            }
        } else {
            if (bil2 > bil3) {
                hasil = bil2;
            } else {
                hasil = bil3;
            }
        }
        System.out.println("Bilangan terbesar adalah: " + hasil);
    }
}