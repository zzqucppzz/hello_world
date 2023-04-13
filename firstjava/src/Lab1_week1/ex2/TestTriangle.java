package Lab1_week1.ex2;
import java.util.Scanner;
public class TestTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 sides:");
        Triangle tri = new Triangle(scanner.nextDouble(),scanner.nextDouble() , scanner.nextDouble());
        System.out.println(tri.verify());
    }    
}
