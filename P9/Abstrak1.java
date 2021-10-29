abstract class hewan {
    // Abstract Method (Tidak ada body)
    public abstract void suara(); 

    // Regular Method
    public void tidur() {
        System.out.println("ZZZZ");
    }
}
class ayam2 extends hewan {
    public void suara() {
        System.out.println("Suara ayam : kukuruyuk");
    } 
}
class Abstrak1 {
    public static void main(String[] args) {
        //membuat objek ayam 
        ayam2 ay = new ayam2();
        ay.suara();
        ay.tidur();
    }
}