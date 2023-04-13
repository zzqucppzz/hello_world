package Lab1;
import java.util.Scanner;
public class TestTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Triangle tri = new Triangle(scanner.nextInt(),scanner.nextInt() , scanner.nextInt());
        System.out.println(tri.verify());
    }
}
