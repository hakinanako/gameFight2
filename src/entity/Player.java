package entity;

public class Player extends Character{
    double xp;
    double level;
    public Player(String name, double health, double attack, double defense, double critical, double criticalIncrease, double shield, double shieldIncrease) {
        super(name, health, attack, defense, critical, criticalIncrease, shield, shieldIncrease);
    }
}
