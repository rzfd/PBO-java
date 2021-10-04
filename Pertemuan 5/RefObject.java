class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("Judul\t:  " + this.judul);
        System.out.println("Penulis\t : " + this.penulis);
    }
}

public class RefObject {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Negeri 5 Menara", "Ahmad Fuadi");
        buku1.display();

        //Menampilkan address
        String addressbuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressbuku1);

        //Assignment Object
        Buku buku2 = buku1;
        buku2.display();
        String addressbuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressbuku2);

        buku2.judul = "Cita - Cita";
        buku1.display();
        buku2.display();

        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku databuku) {
        String addressdatabuku = Integer.toHexString(System.identityHashCode(databuku));
        System.out.println("Address : " + addressdatabuku); 
        databuku.penulis = "Mamad Fuaidi";
    }
}