class Employee
{
String name;
double salary;

Employee(String name, double salary)
{
this.name=name;
this.salary=salary;
}
void displayEmployee()
{
System.out.println("Employee name: "+name);
System.out.println("Salary: "+salary);
}
}

class Manager extends Employee
{
int teamSize;

Manager(String name, double salary, int teamSize)
{
super(name,salary);
this.teamSize=teamSize;
}

void displayManager()
{
displayEmployee();
System.out.println("Team Size: "+teamSize);
}
}

class ProjectManager extends Employee
{
String projectName;

ProjectManager(String name, double salary, String projectName)
{
super(name,salary);
this.projectName=projectName;
}

void displayProjectManager()
{
displayEmployee();
System.out.println("Project name: "+projectName);
}
}

public class Office
{
public static void main(String [] args)
{
Employee e1 = new Employee("Muqbil",67676767);
Manager m1 = new Manager("Muqbil",67676767,12);
ProjectManager p1 = new ProjectManager("Muqbil",67676767,"Eco");

e1.displayEmployee();
m1.displayManager();
p1.displayProjectManager();
}
}
