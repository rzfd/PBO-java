class Mahasiswa {
    String Nama;
    String Jurusan;
    int nim;
    double IPK;
    int age;
}

public class ObjectClass{

    public static void main(String[] args) throws Exception {
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.Nama = "Rizki";
        mahasiswa1.Jurusan = "Informatika";
        mahasiswa1.nim = 2020071015;
        mahasiswa1.IPK = 3.3;
        mahasiswa1.age = 19;

        System.out.println(mahasiswa1.Nama);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.age);


        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa1.Nama = "Tarjo";
        mahasiswa1.Jurusan = "Informatika";
        mahasiswa1.nim = 212312313;
        mahasiswa1.IPK = 3.1;
        mahasiswa1.age = 24;

        System.out.println(mahasiswa1.Nama);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.age);


    }
}