package lab4;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class MainTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input exercise (1-6): ");
        int choice = scanner.nextInt();
        if (choice == 1){
            String name = JOptionPane.showInputDialog("What is your name?");
            String message = "Welcome, "+ name + ", to Java Programming!";
            JOptionPane.showMessageDialog(null,message,"Message",JOptionPane.WARNING_MESSAGE);
        }
        else if (choice == 2){
            Ex2_DrawLine panel = new Ex2_DrawLine();
            JFrame ex2 = new JFrame();
    
            ex2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ex2.add(panel);
            ex2.setSize(250,250);
            ex2.setVisible(true);
        }
        else if (choice == 3){
            System.out.println("Draw figure part a or b (a == 1,b == 2): ");
            int n = scanner.nextInt();
            Ex3_DrawLine panel = new Ex3_DrawLine(n);
            JFrame ex3 = new JFrame();
    
            ex3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ex3.add(panel);
            ex3.setSize(250,250);
            ex3.setVisible(true);             
        }
        else if (choice == 4){
            System.out.println("Draw figure part a or b (a == 1,b == 2): ");
            int n = scanner.nextInt();
            Ex4_DrawLine panel = new Ex4_DrawLine(n);
            JFrame ex4 = new JFrame();
    
            ex4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ex4.add(panel);
            ex4.setSize(250,250);
            ex4.setVisible(true);             
        }
        else if (choice == 5){
            System.out.println("Draw figure part a or b (a == 1,b == 2): ");
            int n = scanner.nextInt();
            Ex5_DrawSpirals panel = new Ex5_DrawSpirals(n);
            JFrame ex5 = new JFrame();
    
            ex5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ex5.add(panel);
            ex5.setSize(1000,1000);
            ex5.setVisible(true);             
        }
        else if (choice == 6){
            String bar1 = JOptionPane.showInputDialog(null, "Enter the length of the bar 1");
            String bar2 = JOptionPane.showInputDialog(null, "Enter the length of the bar 2");
            String bar3 = JOptionPane.showInputDialog(null, "Enter the length of the bar 3");
            String bar4 = JOptionPane.showInputDialog(null, "Enter the length of the bar 4");
            String bar5 = JOptionPane.showInputDialog(null, "Enter the length of the bar 5");
            int len1 = Integer.parseInt(bar1);
            int len2 = Integer.parseInt(bar2);
            int len3 = Integer.parseInt(bar3);
            int len4 = Integer.parseInt(bar4);
            int len5 = Integer.parseInt(bar5);
            Ex6_DrawBar panel = new Ex6_DrawBar(len1,len2,len3,len4,len5);
            JFrame ex6 = new JFrame();
            ex6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ex6.add(panel);
            ex6.setSize(250,250);
            ex6.setVisible(true);             
        }
    }
}
