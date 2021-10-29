abstract class Manusia {
    public abstract void pegawai();

    public void orang() {
        System.out.println("Manusia memiliki nama dan umur");
        System.out.println("Nama    : Tarjo");
        System.out.println("umur    : 20");
    }
}
class karyawan extends Manusia {
    public void pegawai() {
        System.out.println("Gaji    : 2500000");
        System.out.println("NIP     : 20202020");
    }
}
class pg {
    public static void main(String[] args) {
        karyawan p = new karyawan();
        p.orang();
        p.pegawai();
    }
}