package Praktikum03;
class ContohVariable21 {

    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Bermain Petak Umpet";
        boolean isPandai =true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("ipk: " + ipk);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", umurSayaSekarang, tinggi));
    }
}