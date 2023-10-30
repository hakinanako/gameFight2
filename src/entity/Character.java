package entity;

public abstract class Character {
    String name;
    double health;
    double attack;
    double defense;
    double critical;
    double criticalIncrease;
    double shield;
    double shieldIncrease;
    public boolean isAlive() {
        return health > 0;
    }
    // 发起攻击数值计算
    public double damage() {
        double probability = Math.random();
        if (probability < critical) {
            return attack * (1 + criticalIncrease);
        } else {
            return attack;
        }
    }
    // 护盾数值计算
    public double shield() {
        double probability = Math.random();
        if (probability < shield) {
            return defense * (1 + shieldIncrease);
        } else {
            return defense;
        }
    }
    // 攻击
    public void attack(Character character) {
        double damage = damage();
        double shield = character.shield();
        double realDamage = damage - shield;
        if (realDamage > 0) {
            character.setHealth(character.getHealth() - realDamage);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getCritical() {
        return critical;
    }

    public void setCritical(double critical) {
        this.critical = critical;
    }

    public double getCriticalIncrease() {
        return criticalIncrease;
    }

    public void setCriticalIncrease(double criticalIncrease) {
        this.criticalIncrease = criticalIncrease;
    }

    public double getShield() {
        return shield;
    }

    public void setShield(double shield) {
        this.shield = shield;
    }

    public double getShieldIncrease() {
        return shieldIncrease;
    }

    public void setShieldIncrease(double shieldIncrease) {
        this.shieldIncrease = shieldIncrease;
    }

    public Character(String name, double health, double attack, double defense, double critical, double criticalIncrease, double shield, double shieldIncrease) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.critical = critical;
        this.criticalIncrease = criticalIncrease;
        this.shield = shield;
        this.shieldIncrease = shieldIncrease;
    }
}
