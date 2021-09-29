public class OperatorKomparasi {

    public static void main(String[] args){

        int x,y;
        boolean hasilKomparasi;

        // operator equal atau persamaan
        System.out.println("----- PERSAMAAN -----");
        x = 10;
        y = 10;
        hasilKomparasi = (x == y);
        System.out.printf("%d == %d --> %s \n",x,y, hasilKomparasi);

        x = 12;
        y = 10;
        hasilKomparasi = (x == y);
        System.out.printf("%d == %d --> %s \n",x,y, hasilKomparasi);

        // operator not equal atau pertidaksamaan
        System.out.println("----- PERTIDAKSAMAAN -----");
        x = 10;
        y = 10;
        hasilKomparasi = (x != y);
        System.out.printf("%d != %d --> %s \n",x,y, hasilKomparasi);

        x = 12;
        y = 10;
        hasilKomparasi = (x != y);
        System.out.printf("%d != %d --> %s \n",x,y, hasilKomparasi);

        // operator less than atau kurang dari
        System.out.println("----- KURANG dari -----");
        x = 9;
        y = 10;
        hasilKomparasi = (x < y);
        System.out.printf("%d < %d --> %s \n",x,y, hasilKomparasi);

        x = 12;
        y = 10;
        hasilKomparasi = (x < y);
        System.out.printf("%d < %d --> %s \n",x,y, hasilKomparasi);

        // operator greater than atau lebih dari
        System.out.println("----- LEBIH dari -----");
        x = 9;
        y = 10;
        hasilKomparasi = (x > y);
        System.out.printf("%d > %d --> %s \n",x,y, hasilKomparasi);

        x = 12;
        y = 10;
        hasilKomparasi = (x > y);
        System.out.printf("%d > %d --> %s \n",x,y, hasilKomparasi);

        // operator less than equal atau kurang dari sama dengan
        System.out.println("----- KURANG DARI SAMA DENGAN -----");
        x = 9;
        y = 10;
        hasilKomparasi = (x <= y);
        System.out.printf("%d <= %d --> %s \n",x,y, hasilKomparasi);

        x = 10;
        y = 10;
        hasilKomparasi = (x <= y);
        System.out.printf("%d <= %d --> %s \n",x,y, hasilKomparasi);

        x = 12;
        y = 10;
        hasilKomparasi = (x <= y);
        System.out.printf("%d <= %d --> %s \n",x,y, hasilKomparasi);

        // operator greater than equal atau lebih dari sama dengan
        System.out.println("----- LEBIH DARI SAMA DENGAN -----");
        x = 9;
        y = 10;
        hasilKomparasi = (x >= y);
        System.out.printf("%d >= %d --> %s \n",x,y, hasilKomparasi);

        x = 10;
        y = 10;
        hasilKomparasi = (x >= y);
        System.out.printf("%d >= %d --> %s \n",x,y, hasilKomparasi);

        x = 12;
        y = 10;
        hasilKomparasi = (x >= y);
        System.out.printf("%d >= %d --> %s \n",x,y, hasilKomparasi);


    }
}