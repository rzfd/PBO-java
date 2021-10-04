public class JMethod{

    static void methodku(String namaDepan, String namaBelakang) {//Nama adalah parameter
        String nama = namaDepan + " " + namaBelakang; 
        System.out.println("Selamat datang  " + nama);
    }

    public static void main(String[] args) {
        //pemanggilan method dgn argumen
        methodku("Rizki", "Fadillah"); // RIzki adalaah argumen 
    }
}