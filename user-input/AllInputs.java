import java.util.*;
class AllInputs 
{
public static void main (String args[])
{
Scanner sc = new Scanner (System.in);
System.out.print("Enter integer: ");
int i  = sc.nextInt();
System.out.print("Enter float: ");
float f  = sc.nextFloat();
System.out.print("Enter double: ");
double d = sc.nextDouble();
System.out.print("Enter char: ");
char c = sc.next().charAt(0);
System.out.print("Enter word: ");
String w = sc.next();
sc.nextLine();
System.out.print("Enter full line: ");
String line = sc.nextLine();
System.out.println("\n--- OUTPUT ---");
System.out.println(i);
System.out.println(f);
System.out.println(d);
System.out.println(c);
System.out.println(w);
System.out.println(line);
}
}