package QS_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n,y;

        n= in.nextInt();

        MyCalculator a=new MyCalculator();
        y=a.divisorSum(n);

        System.out.println(y);
    }
}
