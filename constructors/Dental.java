class Patient {
int id;
String name;
String contact;
String procedure;
Patient(int id,String name,String contact,String procedure){
this.id=id;
this.name=name;
this.contact=contact;
this.procedure=procedure;
}
int getCost(){
switch(procedure){
            case "Cleaning": return 500;
            case "Filling": return 1500;
            case "Extraction": return 2000;
            case "Root Canal": return 8000;
            default: return 0;
        }
    }

    void display(){
        System.out.println("Patient ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Contact: "+contact);
        System.out.println("Procedure: "+procedure);
        System.out.println("Cost: "+getCost());
        System.out.println();
    }
}

public class Dental {
    public static void main(String[] args) {

        Patient p1 = new Patient(1,"Ravi","9991112222","Cleaning");
        Patient p2 = new Patient(2,"Sita","9991112223","Filling");
        Patient p3 = new Patient(3,"Amit","9991112224","Extraction");
        Patient p4 = new Patient(4,"Priya","9991112225","Root Canal");
        Patient p5 = new Patient(5,"Kiran","9991112226","Cleaning");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}
