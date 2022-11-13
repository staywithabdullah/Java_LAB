package Abstract;

public abstract class Animal {
    String name,color;
    double weight;

    public void eat(){
        System.out.println("Änimal eatss");
    }
    public abstract void makeSound();
}
