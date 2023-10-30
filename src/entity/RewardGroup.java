package entity;

import java.util.ArrayList;

public class RewardGroup {
    private final String name;
    private final double probability;
    private final int exp;
    private final ArrayList<Reward> rewards;

    public String getName() {
        return name;
    }

    public double getProbability() {
        return probability;
    }

    public int getExp() {
        return exp;
    }

    public ArrayList<Reward> getRewards() {
        return rewards;
    }

    public RewardGroup(String name, double probability, int exp, ArrayList<Reward> rewards) {
        this.name = name;
        this.probability = probability;
        this.exp = exp;
        this.rewards = rewards;
    }
}
