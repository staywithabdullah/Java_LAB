package Interface;

import java.sql.SQLOutput;

public class BG96 implements Flyable {

    @Override
    public void fly() {
        System.out.println("This is BG96");
    }

    @Override
    public int needFuel() {
        return 100;
    }
}
