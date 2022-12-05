package File_Write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class write {
    public static void main(String[] args) throws FileNotFoundException {
        File file =new File("U:\\UIU Courses\\OOP lab\\LAB 8\\cd.txt");

        Scanner in = new Scanner(System.in);
        String a=in.nextLine();
        PrintWriter pw=new PrintWriter(file);
        pw.print(a);
        pw.close();
    }
}
