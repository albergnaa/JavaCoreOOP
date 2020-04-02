package homework6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Cat extends Animal {

    //добавлен разброс в ограничениях
    public Cat(String name, Random rnd) {
        super(name, 200 + rnd.nextInt(100) - rnd.nextInt(50),
                0,
                new BigDecimal(2 + rnd.nextDouble() * 4 - rnd.nextDouble() * 2).setScale(1, RoundingMode.HALF_UP).doubleValue());
    }

    //ни за что, даже в воду не зайдет
    @Override
    public boolean swim(int distance) {
        return false;
    }
}

