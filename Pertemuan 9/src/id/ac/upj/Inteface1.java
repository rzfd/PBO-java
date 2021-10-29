package id.ac.upj;


interface  Mahklukhidup {
    public void bernafas();
    public void bernama(String nama);
}

interface  Mamalia {
    public void habitat();
}
class paus implements Mamalia, Mahklukhidup {
    @Override
    public void bernafas() {
        System.out.println("Bernafas dengan paru - paru ");
    }

    @Override
    public void bernama(String nama) {
        System.out.println("Bernama " + nama);
    }

    @Override
    public void habitat() {
        System.out.println("Habitat di laut");
    }
}

public class Inteface1 {
    public static void main(String[] args) {
        paus p = new paus();

        p.bernama("PAUSSSSSSSS");
        p.bernafas();
        p.habitat();
    }
}
