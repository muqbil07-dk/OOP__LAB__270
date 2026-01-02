public class Data_Operations_1
{
public static void main(String args[])
{
//Arithmetic operations
int x = 70;
int y = 36;
int sum = x+y;
int difference = x-y;
int product = x*y;
int quotient = x/y;
int remainder = x%y;
System.out.println("Adding: "+sum);
System.out.println("Subtracting: "+difference);
System.out.println("Multiplicating: "+product);
System.out.println("Dividing: "+quotient);
System.out.println("Remainder: "+remainder);

//Unary operators
System.out.println(x++);
System.out.println(++x);
System.out.println(y++);
System.out.println(++y);
System.out.println(x--);
System.out.println(--x);
System.out.println(y--);
System.out.println(--y);
}
}

