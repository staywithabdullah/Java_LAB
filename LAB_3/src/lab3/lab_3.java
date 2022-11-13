package lab3;

public class lab_3 {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student ("87687",3.6f);
        students[1]=new Student();
        students[2]=new Student();
        System.out.println(students[2].id);
        System.out.println(students[1].id);

    }
}
