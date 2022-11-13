public class Animal {
    double weight;
    String color;

    void eat(){

    }
    void sleep()
    {
        System.out.println("Animal Class sleep");
    }
}
class Bird extends Animal{
    int canFly;
    void fly()
    {
        System.out.println("Bird fly");
    }
}
class Horse extends Animal{
     void sleep()
    {
        System.out.println("Horse class sleep");
    }
}



