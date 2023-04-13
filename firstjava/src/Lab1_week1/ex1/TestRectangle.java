package Lab1_week1.ex1;
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
        System.out.println("Rectangle 1");
        rec1.visualize();
        System.out.println("Rectangle 2");
        rec2.visualize();
        System.out.println("Rectangle 3");
        rec3.visualize();
        System.out.println("Rectangle 4");
        rec4.visualize();
        System.out.println("Rectangle 5");
        rec5.visualize();        
    }
}
