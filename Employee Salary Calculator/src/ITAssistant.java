public class ITAssistant extends Employee{
    private double bonus;
    private double bonusRate;
    private int experience;

    public ITAssistant(String name, String lastName, double salary, double bonusRate, int experience) {
        super(name, lastName, salary);
        this.bonusRate = bonusRate;
        this.bonus = salary * bonusRate;
        this.experience = experience;
    }
    public double salaryCalc() {
        double taxRate = 0.17;
        if (experience < 2){
            bonus = 500;
        }
        else if(experience < 5){
           bonus = 2000;
        }
        else{
            bonus = 5000;
        }
        double grossSalary = super.salary + bonus;
        double taxes = grossSalary * taxRate;
        double netSalary = grossSalary - taxes;
        return netSalary;
    }
}
