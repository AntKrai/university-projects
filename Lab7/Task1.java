abstract class Employee{
    private String firstName;
    private String lastName;
    private double salary;
    private double tax;

    public String getfirstName(){
        return firstName;
    }
    
    public String lastName(){
        return lastName;
    }

    public double getSalary(){
        return salary;
    }

    public double gettax(){
        return tax;
    }

    public Employee(String firstName, String lastName, double salary, double tax){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.tax = tax;
    }
    public abstract double calculatePay();
    public void printPay(){
        System.out.printf("%s %s: Final pay = %.2f PLN%n", firstName, lastName, calculatePay());
    }
}

class Accountant extends Employee {
    public Accountant(String firstName, String lastName, double salary, double tax) {
        super(firstName, lastName, salary, tax);
    }
  
    @Override
    public double calculatePay() {
        double bonus = getSalary() * 0.1;
        return (getSalary() + bonus) * (1-gettax());
    }
}


class ITWorker extends Employee{
    private int yearsExperience;

    public ITWorker(String firstName, String lastName, double salary, int yearsExperience, double tax) {
        super(firstName, lastName, salary, tax);
        this.yearsExperience = yearsExperience;
    }
    
    protected double getBonus() {
        if (yearsExperience < 2) {
            return 500;
        } else if (yearsExperience < 5) {
            return 2000;
        } else {
            return 5000;
        }
    }

    @Override
    public double calculatePay() {
        return (getSalary() + getBonus()) * (1 - gettax());
    }
}

class Programmer extends ITWorker{
    public Programmer(String firstName, String lastName, double salary, int yearsExperience, double tax) {
        super(firstName, lastName, salary, yearsExperience, tax);
    }

    @Override
    public double calculatePay() {
        return (getSalary() + getBonus()) * (1 - (gettax()/2));
    }
}

public class Task1 {
    public static void main(String[] args) {
        final double tax = 0.17;
        Employee[] employees = {
            new Accountant("Adam", "Wisniewski", 6000, tax),
            new ITWorker("Agata", "Wrobel", 7500, 3, tax),
            new ITWorker("Pawel", "Kowalski", 5000, 1, tax),
            new Programmer("Ada", "Nowak", 8000, 6, tax)
        };

        for (Employee emp : employees) {
            emp.printPay();
        }
    }
}