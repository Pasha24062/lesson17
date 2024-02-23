package Dz;

public class Car {
    private int horsepower;
    private int year;

    public Car(int horsepower, int year) {
        this.horsepower = horsepower;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", year=" + year +
                '}';
    }
}
