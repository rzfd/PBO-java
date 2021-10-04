// player
class Player {
    String nama;
    double health;
    int level;
    //object member
    Weapon weapon;
    Armor armor;

    Player (String nama, double health){
        this.nama = nama;
        this.health = health;
    }

    void equip(Weapon weapon) {
        this.weapon = weapon;
    }

    void equiparmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.nama);
        System.out.println("Health : " + this.health);
        this.weapon.display();
        this.armor.display();
    }
}

// Senjata
class Weapon {
    double attack;
    String nama;

    Weapon(String nama, double attack){
        this.nama = nama;
        this.attack = attack;

    }

    void display(){
        System.out.println("Weapon : " + this.nama + " , power : " + this.attack);
    }
}

class Armor {
    double defence;
    String nama;

    Armor(String nama, double defence){
        this.nama = nama;
        this.defence = defence;
    }

    void display(){
        System.out.println("Armor : " + this.nama + " , defence : " + this.defence);
    }
}


public class latihanOOP1{
    public static void main(String[] args) {
        //Membuat object player
        Player player1 = new Player("Tarjo", 100);
        Player player2 = new Player("Susanto", 50);

        //Membuat object senjata
        Weapon pedang = new Weapon("Pedang", 14);
        Weapon pisau = new Weapon("Pisau", 10);

        //Membaut Object armor
        Armor rompi = new Armor("Rompi", 20);
        Armor baju = new Armor("Baju", 15);

        //Equip senjata dan armor
        //player1
        player1.equip(pedang);
        player1.equiparmor(rompi);
        player1.display();

        //Equip senjata dan armor
        //player2
        player2.equip(pisau);
        player2.equiparmor(baju);
        player2.display();

    }
}