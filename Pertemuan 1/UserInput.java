import java.util.Scanner;  // Import the Scanner class

public class UserInput{
    public static void main(String[] args) {
        int x ;
        int y ;
        Scanner inputan = new Scanner  (System.in);
        System.out.println("Masukkan Nilai x = ");
        x = inputan.nextInt();
        System.out.println("Masukkan Nilai y = ");
        y = inputan.nextInt();       
        
        System.out.println("Nilai x = " + x );
        System.out.println("Nilai y = " + y );
    }
}