public class JavaScope{
    public static void main(String[] args) {

    // code here cannot use X

    // { this is a block
        
    // code here cannot use X 
        
        int x = 200;
    
    // code here can use X

        System.out.println(x);
    
    // } The block end here 

    // code here cannot use X
    }
}