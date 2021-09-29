public class  OperasiAritmatika{
    public static void main(String[] args) {
        
        // Operasi Aritmatika

        int a = 10;
        int b = 8;

        int hasil;

        // 1. Penjumlahan 
        hasil = a + b;
        System.out.println(a + " + " + b + " = " + hasil);

        // 2. Pengurangan
        hasil = a - b;
        System.out.printf("%d - %d = %d \n",a,b,hasil);

        //3. Perkalian
        hasil = a * b;
        System.out.printf("%d * %d = %d \n",a,b,hasil);

        //4. Pembagian
        hasil = a / b;
        System.out.printf("%d / %d = %d \n",a,b,hasil);      

        //4. Pembagian jika angka ","
        float x = 2;
        float y = 4;
        float z = x / y;
        System.out.println(x + " / " + y + " = " + z);

        //5. Modulus
        hasil = a % b;
        System.out.printf("%d %% %d = %d \n",a,b,hasil);       

    }
}