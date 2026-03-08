class Employee
{
    String name;

    Employee(String name)
    {
        this.name = name;
    }

    void displayName()
    {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee
{
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary)
    {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    void calculateFullTimeSalary()
    {
        displayName();
        System.out.println("Full Time Salary: ₹" + monthlySalary);
    }
}

class PartTimeEmployee extends Employee
{
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate)
    {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    void calculatePartTimeSalary()
    {
        double salary = hoursWorked * hourlyRate;

        displayName();
        System.out.println("Part Time Salary: ₹" + salary);
    }
}

class ContractEmployee extends Employee
{
    double contractAmount;

    ContractEmployee(String name, double contractAmount)
    {
        super(name);
        this.contractAmount = contractAmount;
    }

    void calculateContractSalary()
    {
        displayName();
        System.out.println("Contract Salary: ₹" + contractAmount);
    }
}

public class ES
{
    public static void main(String[] args)
    {
        FullTimeEmployee f = new FullTimeEmployee("Arjun", 50000);

        PartTimeEmployee p = new PartTimeEmployee("Rahul", 40, 300);

        ContractEmployee c = new ContractEmployee("Meera", 20000);

        f.calculateFullTimeSalary();
        System.out.println();

        p.calculatePartTimeSalary();
        System.out.println();

        c.calculateContractSalary();
    }
}