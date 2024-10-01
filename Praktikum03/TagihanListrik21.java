package Praktikum03;
import java.util.Scanner;

public class TagihanListrik21 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int tarifListrik = 1500;
                
                System.out.println("Masukkan lama penggunaan: ");
                int lamaPenggunaan = sc.nextInt();

                double totalTagihan = tarifListrik*lamaPenggunaan;
                System.out.println("Total tagihan: " + totalTagihan);

                System.out.println(totalTagihan > 500);



            


    }
    
}
