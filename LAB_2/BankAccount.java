package LAB_2;

public class BankAccount {
    public String name;
    public String id;
    public double balance;//balance=0 means direct assignment.
    //constructor
    public BankAccount(String _name, String _id, double _balance){
       this. name= _name;//this means same class var.
       this. id=_id;
      this.  balance=_balance;
    }
    public BankAccount(String _name, double _balance){
       this. name= _name;
      this.  balance=_balance;
    }
    public BankAccount( double _balance){

        balance=_balance;
    }
    public BankAccount( ){


    }

    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw (double amount){
        if(amount <balance)
        {
            balance-=amount;
        }
    }
}
