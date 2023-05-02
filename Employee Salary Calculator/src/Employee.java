public abstract class Employee {
    private String name;
    private String lastName;
    protected double salary;
    public abstract double salaryCalc();

    public Employee(String name, String lastName, double salary){
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
}
