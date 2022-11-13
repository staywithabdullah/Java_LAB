package LAB_2;

public class LAB_2 {
    public static void main(String[] args) {
    BankAccount acc1=new BankAccount("Abdullah","65655",200);//contructor initialization
       // acc1.name="Abdullah";
      //  acc1.id="011221074";
       // acc1.balance=0;//we use 0 in class
        acc1.deposit(100);
        System.out.println("Name:"+acc1.name);
        System.out.println("The account balance is:"+acc1.balance +"Taka only");
        BankAccount acc2=new BankAccount("Limon",100);
//        acc2.name="Limon";
//        acc2.id="656122";
        //acc2.balance=0;
        acc2.deposit(300);
        System.out.println("Name:"+acc2.name);
        System.out.println("The account balance  is:"+acc2.balance+"Tk Only");
        acc2.withdraw(80);
        System.out.println("Current Balance"+acc2.balance+"Tk Only");
        BankAccount acc3=new BankAccount(100);
        BankAccount acc4=new BankAccount();
        acc4.balance=50;
        acc4.deposit(500);
        System.out.println(acc4.balance);
    }
}
