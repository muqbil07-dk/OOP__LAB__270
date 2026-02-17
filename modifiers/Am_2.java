class Employee {
private String name;
private double salary;
public Employee(String n, double s) {
name = n;
salary = s;
}
public void increaseSalary(double amount) {
salary = salary + amount;
}
public void display() {
System.out.println("Employee Name: " + name);
System.out.println("Salary: " + salary);
}
}
public class Am_2 {
public static void main(String[] args) {
Employee e1 = new Employee("Muqbil", 25000);
e1.increaseSalary(5000);
e1.display();
}
}
