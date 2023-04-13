package Lab1;

import java.util.Scanner;
public class TestPoint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();  
        Point point = new Point(x,y);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble(); 
        Point target = new Point(a,b);
        System.out.println(point.distance(target));
    }
}
