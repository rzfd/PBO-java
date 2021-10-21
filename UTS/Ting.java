import java.util.Scanner;
    
class Ting {
    protected float bb, tng, bmi;


    public void setBB(float bb) {
        this.bb = bb;
    }

    public void setTng(float tng) {
        this.tng = tng;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    public float getBB() {
        return this.bb;
    }

    public float getTng() {
        return this.tng;
    }
    
    public float getBmi() {
        return this.bmi;
    }

    public void Masuk() {
        Scanner ip = new Scanner(System.in);

        System.out.println("Masukkan Berat : ");
        bb = ip.nextFloat();

        System.out.println("Masukkan Tinggi : ");
        tng = ip.nextFloat();

        System.out.println("\nBerat anda : " + this.bb);
        System.out.println("tinggi anda : " + this.tng);

        bmi = (this.bb / (this.tng * this.tng));
        System.out.println("Hasil Konversi detik adalah " + this.bmi);

        if(bmi >= 18.5) || (bmi <= 22.9) {
            System.out.println("Berat Ideal");
        } else if (bmi > 22.9) {
            System.out.println("Anda kegemukan");
        } else if (bmi < 18.5) {
            System.out.println("Anda terlalu kurus")
        }

    }
    public static void main(String[] args) {
    
        Ting Id = new Ting();

        Id.Masuk();
    }
}