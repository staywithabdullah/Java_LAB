package QS_2;

public abstract class Animal {
    public int legs;
    public Animal(){

    }
    public Animal(int _legs)
    {
        this.legs=_legs;
    }
    public abstract void eat();

    public void walk(){
        System.out.println("The animal walk with"+legs+"legs");
    }
}
