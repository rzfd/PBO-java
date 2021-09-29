import java.util.Scanner;

public class LatihanAritmatika {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        System.out.println("Luas Persegi Panjang");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("Volume Persegi Panjang");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = "+ volume);
    }
}