package Lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Box box = Box.getInstance(10,10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter step:");
        int n = scanner.nextInt();
        for(int i = 0; i < n;i++){
            box.update();
            box.draw();
            System.out.println("Number of particles: " + box.countParticles());
            try{
                Thread.sleep(200);
            } catch (Exception e){
                e.printStackTrace();
            }
            System.out.flush();
        }
    }   
}
