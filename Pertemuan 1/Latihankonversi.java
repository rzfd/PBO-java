import java.util.Scanner;  // Import the Scanner class

public class Latihankonversi{

public static void main(String[] args) {
    int jam;
    int menit;
    int detik;
    float x, y, z;
    Scanner inputan = new Scanner(System.in);

    System.out.println("Masukkan Jam = ");
    jam = inputan.nextInt();
    System.out.println("Masukkan Menit = ");
    menit = inputan.nextInt();
    System.out.println("Masukkan Detik = ");
    detik = inputan.nextInt();

    System.out.println(jam + " Jam " + menit + " Menit " + detik + " Detik");

    detik= (jam*3600)+(menit*60);
    System.out.println("hasil konversi detik adalah : "+detik);
    }
}