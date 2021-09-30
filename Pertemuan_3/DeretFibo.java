import java.util.*;

public class DeretFibo{
   
   
    public static void main(String[] args) {

        int f1, f2, f3, n;

        Scanner input = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - :");
        n = input.nextInt();

        f1 = 0;
        f2 = 1;
        f3 = 1;

        for(int i = 1; i <= n; i++){
            System.out.println("nilai ke - "+ i + " adalah " + f3);
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
    }
}