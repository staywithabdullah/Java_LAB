package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        int a,b;
        Scanner in=new Scanner(System.in);
        try {
            a=in.nextInt();
            b=in.nextInt();

            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(InputMismatchException f){
            System.out.println("Error: Input mismatched");
        }
        finally {
            System.out.println("Done");
        }
    }
}
