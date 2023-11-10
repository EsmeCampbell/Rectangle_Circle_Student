public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rectangle blackRectangle = new Rectangle (10,5);
        blackRectangle.display();
        blackRectangle.getArea();
        blackRectangle.getPerimeter();

        Circle blackCircle = new Circle (10);
        blackCircle.getArea();
        blackCircle.getCircumference();

        Student Jack = new Student ("Jack",10);
        Jack.getName();
        Jack.getAge();

        bank Esme = new bank(1923,2934);
        Esme.deposit(100);
        Esme.withdraw(200);
        Esme.getBalance();
        Esme.transfer(500);






    }
}