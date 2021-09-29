import java.util.*;

public class Ternary {

    public static void main (String[] args){

        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = inputUser.nextInt();

        // variable x = ekspresi ? statement_true : statement_false

        x = (input == 10) ? (input*input) : (input/2);

        System.out.println("hasilnya " + x);

    }
}