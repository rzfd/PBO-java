import java.util.Scanner;  // Import the Scanner class

public class LatihanJava{
    public static void main(String[] args) {
        float alas ;
        float tinggi ;
        double luas;
        Scanner inputan = new Scanner  (System.in);
        
        System.out.println("Masukkan Alas = ");
        alas = inputan.nextInt();
        System.out.println("Masukkan Tinggi = ");
        tinggi = inputan.nextInt();       
        
        System.out.println("Nilai alas = " + alas );
        System.out.println("Nilai tinggi = " + tinggi );
        
        luas=0.5*alas*tinggi;
        System.out.println("Luas Segitiga : "+luas);
    }
}