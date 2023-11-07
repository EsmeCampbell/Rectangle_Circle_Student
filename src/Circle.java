public class Circle {
    public int radius;

    public Circle(int pRadius){
    radius = pRadius;
    }
    public void getArea(){System.out.println("The Area of the Circle is " + 3.142 * radius * radius);}
    public void getCircumference(){System.out.println("The Circumference of the Circle is " + 2 * radius * 3.142);}
}
