public class MAin {
    public static void main(String[] args) {
        Animal a= new Bird();
        ((Bird)a).fly();
        Animal b=new Horse();
        b.sleep();
    }
}
