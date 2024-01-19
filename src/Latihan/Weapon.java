package Latihan;

public class Weapon {
    private String name;
    private double attack;

    Weapon(String name, double attack) {
        this.name = name;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public double getAttack() {
        return attack;
    }
}
