package homework6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        Animal cat = new Cat("Cat", rnd);
        Animal dog = new Dog("Dog", rnd);
        int distRun, distSwim;
        double highJump;

        //Test Cat
        System.out.println(cat);
        for (int i = 0; i < 3; i++) {
            distRun = rnd.nextInt(300);
            distSwim = rnd.nextInt(10);
            highJump = new BigDecimal(rnd.nextDouble() * 4).setScale(1, RoundingMode.HALF_UP).doubleValue();
            System.out.println(cat.getName() + " может пробежать " + distRun + " м: " + cat.run(distRun));
            System.out.println(cat.getName() + " может проплыть " + distSwim + " м: " + cat.swim(distSwim));
            System.out.println(cat.getName() + " может прыгнуть на " + highJump + " м: " + cat.jump(highJump));
        }
        //Test Cat1
        System.out.println();
        System.out.println(dog);
        for (int i = 0; i < 3; i++) {
            distRun = rnd.nextInt(1000);
            distSwim = rnd.nextInt(20);
            highJump = new BigDecimal(rnd.nextDouble()).setScale(1, RoundingMode.HALF_UP).doubleValue();
            System.out.println(dog.getName() + " может пробежать " + distRun + " м: " + dog.run(distRun));
            System.out.println(dog.getName() + " может проплыть " + distSwim + " м: " + dog.swim(distSwim));
            System.out.println(dog.getName() + " может прыгнуть на " + highJump + " м: " + dog.jump(highJump));
        }


    }
}
