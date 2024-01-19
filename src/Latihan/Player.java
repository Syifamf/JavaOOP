package Latihan;

public class Player {
    private String name;
    private Health health;
    private Weapon weapon;
    private Armor armor;


    Player(String name, double health, String weaponName, double weaponAtack, String armorName, double armorDefence) {
        this.name = name;
        this.health = new Health(health);
        this.weapon = new Weapon(weaponName, weaponAtack);
        this.armor = new Armor(armorName, armorDefence);
    }

     void show() {
        System.out.println(" Nama    : " + name);
        System.out.println(" Health  : " + health.getHealth() + " hp ");
        System.out.println(" Weapon  : " + weapon.getName() + ", attack : " + weapon.getAttack());
        System.out.println(" Armor   : " + armor.getName() + ", defence : " + armor.getDefence());
    }
}
