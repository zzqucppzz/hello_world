package lab4;
import java.util.Scanner;
import javax.swing.JFrame;
public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Draw figure part a or b (a == 1,b == 2): ");
        int n = scanner.nextInt();
        Ex5_DrawSpirals panel = new Ex5_DrawSpirals(n);
        JFrame ex5 = new JFrame();

        ex5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ex5.add(panel);
        ex5.setSize(1000,1000);
        ex5.setVisible(true);         
    }    
}
