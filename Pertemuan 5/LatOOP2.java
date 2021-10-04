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

    void combat(Player opponent){
        double attack = this.weapon.attack;
        System.out.println(this.nama + " Attacking " + opponent.nama + " with power " + attack);
        opponent.bertahan(attack);
    }

    void bertahan(double attack){
        // Pengambilan damage
        double damage;
        if (this.armor.defence < attack){
            damage = attack - this.armor.defence;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.nama + " gots damage " + damage);
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


public class LatOOP2{
    public static void main(String[] args) {
        //Membuat object player
        Player player1 = new Player("Tarjo", 100);
        Player player2 = new Player("Susanto", 50);

        //Membuat object senjata
        Weapon pedang = new Weapon("Pedang", 14);
        Weapon pisau = new Weapon("Pisau", 10);

        //Membaut Object armor
        Armor rompi = new Armor("Rompi", 20);
        Armor baju = new Armor("Baju", 0);

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

        System.out.println("\n Bertempur");
        System.out.println("\n Episode 1 ");
        player1.combat(player2);
        player1.display();
        player2.display();
        System.out.println("\n Episode 2 ");
        player2.combat(player1);
        player1.display();
        player2.display();

    }
}