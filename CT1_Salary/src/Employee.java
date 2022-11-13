public class Employee {
    public String name;
    public double salary;

    public Employee(String _name,double _salary)
    {
        this.name=_name;
        this.salary=_salary;
    }
    public double  getSalary()
    {
        return this.salary;
    }
    public double getAnnualSalary()
    {
        return this.salary*12;
    }
    public double raiseSalary(int var)
    {
        return (((double)var/100)*this.salary)+this.salary;
    }
}
