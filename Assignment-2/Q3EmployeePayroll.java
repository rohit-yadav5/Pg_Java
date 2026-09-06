class Employee {
    protected String name;
    protected String id;
    protected double basicSalary;

    Employee() {
    }

    Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee " + name +
                " (" + id + ") Salary: " +
                calculateSalary();
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + name +
                " (" + id + ") Salary: " +
                calculateSalary();
    }
}

public class Q3EmployeePayroll {
    public static void main(String[] args) {

        Employee e =
                new Employee("Ravi", "E101", 30000);

        Manager m =
                new Manager("Seema", "M202", 40000, 5000);

        System.out.println(e);
        System.out.println(m);
    }
}