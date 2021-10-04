public class MultipleObject{
    //Atribut
    int x=5; //atribut dari class OOP1 (Variable Class)

    public static void main(String[] args) {
        OOP1 OBJ1 = new OOP1(); //Object 1
        OOP1 OBJ2 = new OOP1(); //Object 2
        OBJ2.x = 25;
        System.out.println(OBJ1.x);
        System.out.println(OBJ2.x);
    }

}