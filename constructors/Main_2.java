class enrollments
{
static int counter = 101;
int rollno;
String name;
String course;

enrollments()
{
rollno = 0;
name = "Unassigned";
course = "General";
}

enrollments(String name, String course)
{
this.rollno = counter++;
this.name = name;
this.course = course;
}

enrollments(enrollments s)
{
this.rollno = counter++;
this.name = s.name;
this.course = s.course;
}

void display()
{
System.out.println("Roll no:"+rollno+ "Name:"+name+"Course:"+course);
}
}

public class Main_2
{
public static void main(String [] args)
{
enrollments e1 = new enrollments();
enrollments e2 = new enrollments("Dube", "Crease");
enrollments e3 = new enrollments(e2);

e1.display();
e2.display();
e3.display();
}
}