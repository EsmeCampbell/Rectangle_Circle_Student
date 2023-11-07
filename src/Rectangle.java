public class Rectangle {
    public int length;
    public int width;

    public Rectangle(int pLength, int pWidth){
        length = pLength;
        width = pWidth;
    }
    public void display(){System.out.println("Length is " + length + " Width is " + width);}
    public void getArea(){System.out.println("The Area of the Rectangle is " + length*width);}
    public void getPerimeter(){System.out.println("The Perimeter of the Rectangle is " + 2*(length + width));}


}
