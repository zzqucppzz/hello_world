package lab4;

import javax.swing.JFrame;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Draw figure part a or b (a == 1,b == 2): ");
        int n = scanner.nextInt();
        Ex3_DrawLine panel = new Ex3_DrawLine(n);
        JFrame ex3 = new JFrame();

        ex3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ex3.add(panel);
        ex3.setSize(250,250);
        ex3.setVisible(true);        
    }
}
