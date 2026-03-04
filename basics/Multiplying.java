import java.util.Scanner;
public class Multiplying
{
public static void main(String [] args)
{
Scanner m = new Scanner(System.in);
System.out.print("Enter a num: ");
int num = m.nextInt();
for (int i = 1; i<=10; i++)
{
System.out.println(num+" * "+i+" = "+ num*i);
}
}
}