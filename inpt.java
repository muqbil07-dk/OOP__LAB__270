import java.util.Scanner;
class inpt {
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);
System.out.println("Enter name, department and section:");
String name = myObj.nextLine();
String department = myObj.nextLine();
String section = myObj.nextLine();
System.out.println("Name: " + name);
System.out.println("Department: " + department);
System.out.println("Section: " + section);
}
}