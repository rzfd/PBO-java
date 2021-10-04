class Mahasiswa{
    String nama;
    String nim;

Mahasiswa(String nama,String nim){
    this.nama = nama;
    this.nim = nim;
}

// Method tanpa return dan tanpa parameter
void show(){
    System.out.println("Nama : " + this.nama);
    System.out.println("Nim : " + this.nim);
}

// Method tanpa return dan dengan parameter
void setnama(String nama){
    this.nama = nama;
}

// Method dengan return tidak dengan parameter
String getnama(){
    return this.nama;
}

//method dengan return dan tidak dengan parameter
String getnim(){
    return this.nim;
}

//method dengan return dan dengan parameter
String sayhi(String pesan){
    return pesan + " juga, nama saya adalah " + this.nama;
    }
}

public class MethodYT{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Tarjo", "29312312");
        //method
        mahasiswa1.show();
        mahasiswa1.setnama("Susanto");
        mahasiswa1.show();
        
        System.out.println(mahasiswa1.getnama());
        System.out.println(mahasiswa1.getnim());

        String data = mahasiswa1.sayhi("Ganteng");
        System.out.println(data);
    }
}
