public class EmployeCheck {
    public static void main(String[] args) {
        Employee M=new Employee("Masud",5000);
        System.out.println(M.getSalary());

        System.out.println(M.getAnnualSalary());

        System.out.println(M.raiseSalary(20));
    }

}
