package Lab3.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Point2D[] points = new Point2D[2];
        for(int i = 0; i < points.length;i++){
            System.out.println("Enter type of point (1=2D,2=3D)");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Input x and y:");
                    points[i] = new Point2D(scanner.nextFloat(),scanner.nextFloat());
                    break;
                }
                case 2:{
                    System.out.println("Input x, y, z:");
                    points[i] = new Point3D(scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat());
                    break;                    
                }
                default:{
                    System.out.println("Invalid choice!!!");
                    i--;
                    break;
                }
            }
        }
        for(Point2D point : points){
            if (point.check()==1){
                System.out.println(point.toString());
            }
            else {
                System.out.println(point.toString());
            }
        }
    }
}
