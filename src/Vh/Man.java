package Vh;

public class Man {
    private int weight;
    private int height;

    public Man(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Man{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
