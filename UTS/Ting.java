import java.util.Scanner;
    
class Ting {
    protected double bb, tng, bmi;


    public void setBB(double bb) {
        this.bb = bb;
    }

    public void setTng(double tng) {
        this.tng = tng;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getBB() {
        return this.bb;
    }

    public double getTng() {
        return this.tng;
    }
    
    public double getBmi() {
        return this.bmi;
    }

    public void Masuk() {
        Scanner ip = new Scanner(System.in);

        System.out.println("Masukkan Berat : ");
        bb = ip.nextDouble();

        System.out.println("Masukkan Tinggi : ");
        tng = ip.nextDouble();

        System.out.println("\nBerat anda : " + this.bb);
        System.out.println("tinggi anda : " + this.tng);

        bmi = (this.bb / (this.tng * this.tng));
        System.out.println("Hasil BMI adalah " + this.bmi);

        if((bmi >= 18.5) && (bmi <= 22.9)) {
            System.out.println("Berat Ideal");
        } else if (bmi > 22.9) {
            System.out.println("Anda kegemukan");
        } else if (bmi < 18.5) {
            System.out.println("Anda terlalu kurus");
        }

    }
    public static void main(String[] args) {
    
        Ting Id = new Ting();

        Id.Masuk();
    }
}