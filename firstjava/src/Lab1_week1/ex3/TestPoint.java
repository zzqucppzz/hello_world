package Lab1_week1.ex3;
import java.util.Scanner;
public class TestPoint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input coordinate of current point:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();  
        Point point = new Point(x,y);
        System.out.println("Input coordinate of target point:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble(); 
        Point target = new Point(a,b);
        System.out.print("Distance from the current point and the given target point:");
        System.out.println(point.distance(target));
    }    
}
