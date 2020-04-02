package homework6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Dog extends Animal {

    //добавлен разброс в ограничениях
    public Dog(String name, Random rnd) {
        super(name, 500 + rnd.nextInt(1000) - rnd.nextInt(500),
                10 + rnd.nextInt(20) - rnd.nextInt(10),
                new BigDecimal(0.5 + rnd.nextDouble() - rnd.nextDouble() / 2).setScale(1, RoundingMode.HALF_UP).doubleValue());
    }
}
