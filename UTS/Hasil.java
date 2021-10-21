public class Hasil extends Datar {
    protected float luas, keliling;

    public void setKeliling(float keliling) {
        this.keliling  = keliling;
    }

    public void setLuas(float luas) {
        this.luas = luas;
    }

    public float getKeliling(float keliling) {
        return this.keliling;
    }

    public float getLuas() {
        return this.luas;
    }

    public void hitung() {
        luas = this.phi * this.r * this.r;
        keliling = 2 * this.phi * this.r;

        System.out.println("Hasil Keliling adalah " + this.keliling + "Luas " + this.luas);
    }

    public static void main(String[] args) {
        Hasil h = new Hasil();

        h.cari();
        h. hitung();
    }
}