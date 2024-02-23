package Dz;

public class Helm {
    private int wheeldiametr;
    private String material;

    public Helm(int wheeldiametr, String material) {
        this.wheeldiametr = wheeldiametr;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "wheeldiametr=" + wheeldiametr +
                ", material='" + material + '\'' +
                '}';
    }
}
