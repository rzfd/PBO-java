import java.util.Scanner;

public class latihan {
    static void Para(int nilai) {
        if (nilai<60) {
            System.out.println("Anda tidak lulus ujian");
        } else {
            System.out.println("SELAMAT ANDA TELAH LULUS UJIAN ");
        }
    }

    public static void main(String[] args) {

    Para(20);
    }
}