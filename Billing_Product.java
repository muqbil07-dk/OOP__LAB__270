public class Billing_Product
{
public static void main(String args[])
{
int Invoice_ID = 76853;
int Product_ID = 111256;
double Product_Cost = 269.676767;
int Quantity = 63;
double Discount = 8.502866;
double Total_Price = (Product_Cost * Quantity) - Discount;
boolean feedback = true;
System.out.println(Total_Price);
}
}