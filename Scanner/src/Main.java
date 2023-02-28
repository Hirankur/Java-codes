import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inpu = new Scanner(System.in);

        Vehicle myObj = new Vehicle();
        myObj.run();

        int x = inpu.nextInt();
        Bike myObj1 = new Bike();
        myObj1.speed = x;
        myObj1.run();

        int y = inpu.nextInt();
        Car myObj2 = new Car();
        myObj2.speed = y;
        myObj2.run();

    }
}