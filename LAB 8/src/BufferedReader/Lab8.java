package BufferedReader;

import java.io.*;

public class Lab8 {
    public static void main(String[] args) throws IOException {
        File file= new File("U:\\UIU Courses\\OOP lab\\LAB 8\\ab.txt");
        File file2= new File("U:\\UIU Courses\\OOP lab\\LAB 8\\cd.txt");

        BufferedReader br= new BufferedReader(new FileReader(file)); //Read file
        BufferedWriter bw=new BufferedWriter(new FileWriter(file2)); //Write file
        String s;
        while((s=br.readLine())!=null){//s read line by line
            bw.write(s);
            bw.newLine();//for newline

        }
        bw.close();
        br.close();

    }
}
