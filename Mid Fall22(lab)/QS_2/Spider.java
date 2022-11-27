package QS_2;

public class Spider extends Animal{
    Spider(int legs){
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("The Spider eats");
    }
}
