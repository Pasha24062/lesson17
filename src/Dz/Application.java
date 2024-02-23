package Dz;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(367,2016));
        list.add(new Car(799,2020));
        list.add(new Car(298,2013));
        System.out.println("незнаю шо тут писать");
        for (Car car : list);
        System.out.println(list);

    }
}
