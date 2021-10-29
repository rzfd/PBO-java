import java.util.Scanner;

 class Datar {

    protected float phi;
    protected float r;
    protected float keliling;
    protected float luas;

    public void setPhi(float phi) {
        this.phi = phi;
    }

    public void r(float r) {
        this.r = r;
    }

    public void setKeliling(float keliling) {
        this.keliling  = keliling;
    }

    public void setLuas(float luas) {
        this.luas = luas;
    }

    public float getPhi()  {
        return this.phi;
    }

    public float getR() {
        return this.r;
    }

    public float getKeliling(float keliling) {
        return this.keliling;
    }

    public float getLuas() {
        return this.luas;
    }

    public void cari() {
        Scanner cr = new Scanner(System.in);

        System.out.println("rusuk lingkaran : ");
        r = cr.nextFloat();
        System.out.println("phi lingkaran : ");
        phi = cr.nextFloat();

        System.out.println("Rusuk lingkaran : " + this.r);
        System.out.println("phi Lingkaran :" + this.phi);
    }

    public static void main(String[] args) {
        
        Datar d = new Datar();
        d.cari();
    }
 } 