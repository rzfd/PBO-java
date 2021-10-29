import java.util.Scanner;
    
class Telpon {
    protected int jam, menit, detik, total;


    public void setTotal(int total) {
        this.total = total;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    public int getJam() {
        return this.jam;
    }

    public int getMenit() {
        return this.menit;
    }
    
    public int getDetik() {
        return this.detik;
    }

    public int getTotal() {
        return this.total;
    }

    public void Masukan() {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Jam : ");
        jam = in.nextInt();

        System.out.println("Masukkan Menit : ");
        menit = in.nextInt();

        System.out.println("Masukkan Detik : ");
        detik = in.nextInt();

        System.out.println("\nJam : " + this.jam);
        System.out.println("Menit : " + this.detik);
        System.out.println("Detik : " + this.menit);

        this.total = (this.jam * 60 * 60) + (this.menit * 60) + (this.detik * 1);
        System.out.println("Hasil Konversi detik adalah " + this.total);

    }

    public static void main(String[] args) {
        Telpon v = new Telpon();

        v.Masukan();
    }
}