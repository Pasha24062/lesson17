package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String customerName;
    private int totalPrice;
    private List<Coffe> totalCoffe = new ArrayList<>();


    public Order(int id, String customerName, int totalPrice, List<Coffe> totalCoffe) {
        this.id = id;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.totalCoffe = totalCoffe;
    }

    public Order() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Coffe> getTotalCoffe() {
        return totalCoffe;
    }

    public void setTotalCoffe(List<Coffe> totalCoffe) {
        this.totalCoffe = totalCoffe;
    }

    private int calculateTotalPrice() {
        for (Coffe c : totalCoffe) {
            totalPrice += c.getPrice();
        }
        return totalPrice;
    }

    public void createOrder() {
    }

    public Coffe[] getTotalList() {
        return new Coffe[0];
    }

    public void createOrder(Coffe capuchino) {
    }
}

