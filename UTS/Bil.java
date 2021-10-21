import java.util.Scanner;

class Bil {
    public static void main(String[] args) {
    int nilai;
    Scanner ms = new Scanner(System.in);

    System.out.println("Masukkan Nilai");
    nilai = ms.nextInt();
    System.out.println("Nilai ke- " + nilai);

    }
    printbil(nilai);

    public static void printbil(int parameter) {
        System.out.println("Nilai : " + parameter);

        if(parameter == 0) {
            return;
        }

        parameter--;

        printbil(parameter)
    }
}