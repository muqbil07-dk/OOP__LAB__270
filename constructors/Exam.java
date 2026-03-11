class Shape {
 void area() {
 System.out.println("Area of Shape");
 }
}
class Circle extends Shape {
 double r=5;
 void area() {
 double result=3.14*r*r;
 System.out.println("Area of Circle: " + result);
}
}
class Rectangle extends Shape {
 int length=4,breadth=6;
 void area() {
 int result=length*breadth;
 System.out.println("Area of Rectangle: " + result);
 }
}
class Triangle extends Shape {
 int b=4,h=5;
 void area() {
 double result=0.5*b*h;
 System.out.println("Area of Triangle: " + result);
}
}
public class Exam {
 public static void main(String[] args) {
 Shape s;
 s = new Circle();
 s.area();
 s= new Rectangle();
 s.area();
 s = new Triangle();
 s.area();
 }
}