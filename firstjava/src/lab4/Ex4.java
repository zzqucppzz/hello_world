package lab4;
import java.util.Scanner;
import javax.swing.JFrame;
public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Draw figure part a or b (a == 1,b == 2): ");
        int n = scanner.nextInt();
        Ex4_DrawLine panel = new Ex4_DrawLine(n);
        JFrame ex4 = new JFrame();

        ex4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ex4.add(panel);
        ex4.setSize(250,250);
        ex4.setVisible(true);         
    }
}
