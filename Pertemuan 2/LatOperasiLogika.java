import java.util.*;

public class LatOperasiLogika {

    public static void main(String[] args){

        // membuat sebuah objek untuk menangkap input dari user
        Scanner input = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("masukan nilai tebakan anda: ");
        nilaiTebakan = input.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda: " + statusTebakan);

        // operasi aljabar boolean (and / or)

        System.out.print("masukan nilai diantara 4 dan 9: ");
        nilaiTebakan = input.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        System.out.println("tebakan anda: " + statusTebakan);


    }
}