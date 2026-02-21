class gadgets
{
String dn;
String ds;
String fv;

gadgets()
{
dn = "SG-Device";
ds = "Inactive";
fv = "v1.0";
}
gadgets(String dn, String fv)
{
this.dn = dn;
this.fv = fv;
this.ds = "Inactive";
}

gadgets(String dn, String ds, String fv)
{
this.dn = dn;
this.fv = fv;
this.ds = "Active";
}

void display()
{
System.out.println("Device name: "+dn);
System.out.println("Firmware version: "+fv);
System.out.println("Default status: "+ds);
}
}

public class Main 
{
public static void main (String []args)
{
gadgets g1 = new gadgets();
gadgets g2 = new gadgets("siuuu","v2.4");
gadgets g3 = new gadgets("messi","v2.6");
g1.display();
g2.display();
g3.display();
}
}