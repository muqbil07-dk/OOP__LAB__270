import java.util.Scanner;
public class ElectricityBill {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter units consumed: ");
int units = sc.nextInt();
double bill = units*5;
double finalBill;
if (units<=100) {
finalBill=bill;
System.out.println("No discount applied");
} else if (units<=300){
finalBill = bill - (bill*0.10);
System.out.println("10% discount applied");
}else{
finalBill = bill - (bill*0.20);
System.out.println("20% discount applied");
}
System.out.println("Total bill amount: " + finalBill);
sc.close();
}
}
