public class avg
{
public int avg(int nA , int nB, int nC)
{
return (nA+nB+nC)/3;
}
public static void main (String args[])
{
avg obj = new avg();
int average = obj.avg(67,69,48);
System.out.println("Average of three numbers is: "+average);
}
}