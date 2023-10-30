package entity;

public class Reward {
    private final String name;
    private final double probability;

    public Reward(String name, double probability) {
        this.name = name;
        this.probability = probability;
    }

    public String getName() {
        return name;
    }

    public double getProbability() {
        return probability;
    }
}
