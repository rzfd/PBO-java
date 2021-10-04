// Class tanpa constructor / class polos

class polos {
    String datastring;
    int datainteger;
}

class Mahasiswa{
    String nama;
    String nim;
    String jurusan;


// Constructor dipanggil saat object pertama kali dibuat
// Mahasiswa(){
//     System.out.println("Ini adalah COnstructor")
// }

// Contructor dengan parameter

Mahasiswa(String inputnama, String inputnim, String inputjurusan){
    nama = inputnama;
    nim = inputnim;
    jurusan = inputjurusan;

    System.out.println(nama);
    System.out.println(nim);
    System.out.println(jurusan);

    }
}

public class ConstructorYT{
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Rizki", "2020071015", "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Tarjo", "2020071014", "Informatika");
    }
}