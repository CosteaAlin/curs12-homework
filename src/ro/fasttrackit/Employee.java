package ro.fasttrackit;

public class Employee extends Person {
    private final String company;
    private final int salary;

    public Employee(String name, int age, String hairColor, String company, int salary) {
        super(name, age, hairColor);
        this.company = (handleNulls(company)) ? "No company" : company;
        this.salary = salary;
    }

    public String getCompany() {
        return this.company;
    }

    public double getSalary() {
        return this.salary;
    }
}
