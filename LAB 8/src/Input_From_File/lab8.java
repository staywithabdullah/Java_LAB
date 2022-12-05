package Input_From_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("U:\\UIU Courses\\OOP lab\\LAB 8\\ab.txt");

        Scanner in = new Scanner(file);
        String a = new String();
        while (in.hasNext()) {
            a = in.nextLine();
            System.out.println(a);
        }
    }
}
