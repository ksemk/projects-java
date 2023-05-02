public class Salary {
    public static void main(String[] args) {
        Accountant accountant = new Accountant("Adam", "Wiśniewski", 6000, 0.1);
        ITAssistant itAssistant1 = new ITAssistant("Agata", "Wróbel", 7500,0.1, 3);
        ITAssistant itAssistant2 = new ITAssistant("Paweł", "Kowalski", 5000, 0.1, 1);
        Programmer programmer = new Programmer("Ada", "Nowak", 8000, 0.1, 6);

        System.out.println("The accountant salary is: " + accountant.salaryCalc() + " PLN\n");
        System.out.println("The 1st IT assistant salary is: " + itAssistant1.salaryCalc() + " PLN\n");
        System.out.println("The 2nd IT assistant salary is: " + itAssistant2.salaryCalc() + " PLN\n");
        System.out.println("The programmer salary is: " + programmer.salaryCalc() + " PLN\n");
    }
}