package homework7;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat("someCat", 1 + rnd.nextInt(20)));
            System.out.println(cats.get(i).toString());
        }
        Plate plate = new Plate(50);
        plate.addFood(30);
        plate.info();
        for (int i = 0; i < 10; i++) {
            cats.get(i).eat(plate);
            System.out.println(cats.get(i).isSatiety());
        }
        plate.info();
    }
}
