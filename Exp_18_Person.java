class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Person: Name - " + name + ", Age - " + age);
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Employee: Employee ID - " + employeeId + ", Salary - $" + salary);
    }
}

public class Exp_18_Person {
    public static void main(String[] args) {
        Person person = new Person("Grimmjow Jaegerjaquez ", 89);
        Employee employee = new Employee("Ludger Cherish", 25, 12345, 50000.0);

        person.displayPersonInfo();
        System.out.println(); 
        employee.displayEmployeeInfo();
    }
}
