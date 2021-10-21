public class Konversi extends Telpon {
    protected int tarif = 0;
    protected int pulsa = 0;

    public void setPulsa(int pulsa) {
        this.pulsa = pulsa; 
    }
    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public int getTarif() {
        return this.tarif;
    }

    public int getPulsa() {
        return this.pulsa;
    }

    public void tarif() {
        pulsa = (this.total / 5);
        tarif = (this.pulsa * 150);  

        System.out.println("Pulsa total anda adalah " + this.pulsa);
        System.out.println("Total Tarif adalah " + this.tarif);
    }

    public static void main(String[] args) {
        
        Konversi tf = new Konversi();

        tf.Masukan();
        tf.tarif();

    }
}