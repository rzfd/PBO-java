import java.util.*;

public class BreakContinueReturn {

    public static void main (String[] args){

        int x = 0;

        while(true){
            x++;

            if(x == 10){
                break;

            } else if(x == 5){
                continue;

            } else if (x == 7){
                return;
            }

            System.out.println("looping ke - " + x);

        }

        System.out.println("akhir dari looping");

    }
}