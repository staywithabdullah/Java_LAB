package Interface;

public class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("This is Bird");
    }

    @Override
    public int needFuel() {

        return 0;
    }
}
