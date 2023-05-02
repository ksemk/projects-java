public class Accountant extends Employee {
    private double bonus;
    private double bonusRate;

    public Accountant(String name, String lastName, double salary, double bonusRate){
        super(name, lastName, salary);
        this.bonusRate = bonusRate;
        this.bonus = bonusRate * salary;
    }

    @Override
    public double salaryCalc() {
    double taxRate = 0.17;
    double grossSalary = super.salary + bonus;
    double taxes = grossSalary * taxRate;
    double netSalary = grossSalary - taxes;
    return netSalary;
    }
}