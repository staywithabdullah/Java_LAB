package Interface;

public class main {
    public static void main(String[] args) {
        Flyable a=new Bird();
        a.fly();
       // a.media="hhd" notun kono value deya jabena
        Flyable b=new BG96();
        b.fly();
        System.out.println("Need fuel"+b.needFuel());


    }
}
