package Lab3.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MyShape[] shapes = new MyShape[5];
        for(int i = 0; i < shapes.length;i++){
            System.out.printf("Select shape %d (1=Line, 2=Oval, 3=Rectangle): ",i+1);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Input length: ");
                    int length = scanner.nextInt();
                    shapes[i] = new MyLine(length);
                    break;
                }
                case 2:{
                    System.out.println("Input width: ");
                    int width = scanner.nextInt();
                    System.out.println("Input height: ");
                    int height = scanner.nextInt();                    
                    shapes[i] = new MyOval(width,height);
                    break;
                }
                case 3:{
                    System.out.println("Input width: ");
                    int width = scanner.nextInt();
                    System.out.println("Input height: ");
                    int height = scanner.nextInt();                    
                    shapes[i] = new MyRectangle(width,height);
                    break;
                }
                default:{
                    System.out.println("Invalid choice!!!");
                    i--;
                    break;
                }
            }
        }
        for(MyShape shape : shapes){
            shape.Draw();
            if (shape.check() == 1){
                System.out.println("Area: "+((MyBoundedShape)shape).GetArea());
            }
        }

    }
}
