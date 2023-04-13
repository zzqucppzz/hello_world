package Lab1;
import java.util.Scanner;
public class TestRectangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width and height of rectangle 1");
        Rectangle rec1 = new Rectangle(scanner.nextInt(), scanner.nextInt());
        System.out.println("Input width and height of rectangle 2");
        Rectangle rec2 = new Rectangle(scanner.nextInt(), scanner.nextInt());
        System.out.println("Input width and height of rectangle 3");
        Rectangle rec3 = new Rectangle(scanner.nextInt(), scanner.nextInt());
        System.out.println("Input width and height of rectangle 4");
        Rectangle rec4 = new Rectangle(scanner.nextInt(), scanner.nextInt());
        System.out.println("Input width and height of rectangle 5");
        Rectangle rec5 = new Rectangle(scanner.nextInt(), scanner.nextInt());
        rec1.visualize();
        rec2.visualize();
        rec3.visualize();
        rec4.visualize();
        rec5.visualize();
    }
}
