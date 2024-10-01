package Praktikum03;
import java.util.Scanner;

public class GajiBulanan21 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamKerja;
        double bonus, pajak, upah, upahKotor, upahBonus, upahPajak, gajiAkhir;

        bonus = 0.10; 
        pajak = 0.05;
        upah = 100000;

        System.out.println("Masukkan jumlah jam kerja anda: ");
        jamKerja = sc.nextInt();

        upahKotor = jamKerja * upah;
        upahBonus = (bonus * upahKotor);
        System.out.println("Upah anda sebelum bonus: " + upahKotor);
        System.out.println("Upah anda setelah bonus 10% : Rp. " + (upahKotor + upahBonus));

        upahPajak = (pajak * (upahKotor + upahBonus));
        System.out.println("Upah anda setelah pajak 5%: Rp. " + (upahBonus + upahKotor - upahPajak));
        
    }
}
