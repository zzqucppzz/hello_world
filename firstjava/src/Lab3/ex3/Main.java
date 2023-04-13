package Lab3.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[3];
        for(int i = 0; i < persons.length;i++){
            System.out.print("Enter type (1=Person,2=Student,3=Staff):");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:{
                    System.out.println("Input name:");
                    String name = scanner.nextLine();
                    System.out.println("Input address:");
                    String address = scanner.nextLine();
                    persons[i] = new Person(name, address);                    
                    break;
                }
                case 2:{
                    System.out.println("Input name:");
                    String name = scanner.nextLine();
                    System.out.println("Input address:");
                    String address = scanner.nextLine();
                    System.out.println("Input program:");
                    String program = scanner.nextLine();
                    System.out.println("Input year:");
                    int year = scanner.nextInt();
                    System.out.println("Input fee:");
                    double fee = scanner.nextDouble();
                    persons[i] = new Student(name, address, program, year, fee);                    
                    break;                    
                }
                case 3:{
                    System.out.println("Input name:");
                    String name = scanner.nextLine();
                    System.out.println("Input address:");
                    String address = scanner.nextLine();
                    System.out.println("Input school:");
                    String school = scanner.nextLine();
                    System.out.println("Input pay:");
                    double pay = scanner.nextDouble();
                    persons[i] = new Staff(name, address, school, pay);                    
                    break; 
                }
                default:{
                    System.out.println("Invalid choice!!!");
                    i--;
                    break;
                }
            }
        }
        for(Person person : persons){
            System.out.println(person.toString());
        }
    }
}
