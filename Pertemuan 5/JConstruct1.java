public class JConstruct1{
    int x; //  Create a class attributes

    public JConstruct1(){
        x = 5; // (Set the initial Value for the class attributes x)
    }

    public static void main(String[] args) {
        JConstruct1 OBJ1 = new JConstruct1(); // Create an object of class JConstruct1 (This will call the Instructor)
        System.out.println(OBJ1.x); // Print x Value
    }
}