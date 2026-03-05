class Person
{
String name;
int age;
Person(String name, int age)
{
this.name = name;
this.age = age;
}
}
class Student extends Person
{
int studentId;
String course;
Student(String name, int age, int studentId, String course)
{
super(name, age);   // calling parent constructor
this.studentId = studentId;
this.course = course;
}
void display()
{
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Student ID: " + studentId);
System.out.println("Course: " + course);
}
}
public class Student
{
public static void main(String[] args)
{
Student s = new Student("Rahul", 20, 101, "Computer Science");
s.display();
}
}