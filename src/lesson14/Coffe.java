package lesson14;

import java.util.List;

public class Coffe {
    private String name;
    private int price;
    private List<SizeCoffe> size;

    public Coffe(String name, int price, List<SizeCoffe> size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<SizeCoffe> getSize() {
        return size;
    }

    public void setSize(List<SizeCoffe> size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Coffe{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
