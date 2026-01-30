import java.util.*;
public class Prime {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int m = sc.nextInt();
boolean isPrime = true;
if (m <= 1)
isPrime = false;
for (int i = 2; i <= Math.sqrt(m); i++) {
if (m % i == 0) {
isPrime = false;
break;
}
}
System.out.println(m + " is " + (isPrime ? "Prime" : "Not Prime"));
sc.close();
}
}
