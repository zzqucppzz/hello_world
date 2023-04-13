package Lab3.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MyPoint[] points = new MyPoint[3];
        for(int i = 0;i < points.length;i++){
            System.out.printf("Enter coordinate of point %d\n",i+1);
            System.out.println("Enter x and y: ");
            points[i] = new MyPoint(scanner.nextInt(), scanner.nextInt());
        }
        MyTriangle triangle1 = new MyTriangle(points[0], points[1], points[2]);
        MyTriangle triangle2 = new MyTriangle(points[0].getX(),points[0].getY(), points[1].getX(), points[1].getY(), points[2].getX(),points[2].getY());
        MyTriangle[] triangles = {triangle1,triangle2};
        for(MyTriangle triangle : triangles){
            System.out.println(triangle.toString());
            System.out.println("Perimeter of triangle: "+ triangle.getPerimeter());
            System.out.println("Type of triangle: "+ triangle.getType());
        }



    }
}
