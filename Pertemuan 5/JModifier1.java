public class JModifier1{
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        JModifier1 OBJ1 = new JModifier1();
        OBJ1.x = 50; //Will generate error: Cannot assign a value to a Final Variable
        OBJ1.PI = 25; //Will generate error: Cannot assign a value to a Final Variable
    }
}