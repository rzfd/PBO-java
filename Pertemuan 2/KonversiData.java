public class KonversiData{
    public static void main(String[] args) {

        int NilaiINT = 250;// untuk byte maks data 32 bit
        System.out.println(" Nilai Int = " + NilaiINT);

        long NilaiLONG = 250; // untuk long maks 64 bit
        System.out.println(" Nilai Long = " + NilaiLONG);

        //Memperkecil Rentan ke tipe data yang lebih kecil 
        byte nilaibyte = (byte) NilaiINT;
        System.out.println("Nilai Byte = " + nilaibyte);
        System.out.println("Nilai MAX Byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai MIN Byte = " + Byte.MIN_VALUE);

        //Casting Pembagian 1 
        int a = 24;
        float b = 8;
        
        float c = a/b;

        System.out.printf("%d / %f = %f\n",a,b,c);

        
        //Casting Pembagian 2 
        int x = 24;
        int y = 8;
        
        float z = (float) a/b;

        System.out.printf("%d / %d = %f\n",x,y,z);

    }
}