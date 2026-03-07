class Person
{
String name;
int age;

Person(String name,int age)
{
this.name = name;
this.age = age;
}

void displaypd()
{
System.out.println("Name: "+name);
System.out.println("Age: "+age);
}
}

class Student extends Person
{
String studentId;
String course;

Student(String name, int age, String studentId, String course)
{
super(name,age);
this.studentId=studentId;
this.course=course;
}

void displaysd()
{
System.out.println("*Student details*");
displaypd();
System.out.println("Student ID: "+studentId);
System.out.println("Course: "+course);
}
}

public class Academic
{
public static void main (String [] args)
{
Student s1 = new Student ("Muqbil",18,"CH.SC.U4CSE25270","CSE");
s1.displaysd();
}
}