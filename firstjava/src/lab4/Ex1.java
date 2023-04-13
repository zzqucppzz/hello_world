package lab4;
import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args){
    String name = JOptionPane.showInputDialog("What is your name?");
    String message = "Welcome, "+ name + ", to Java Programming!";
    JOptionPane.showMessageDialog(null,message,"Message",JOptionPane.WARNING_MESSAGE);
    }
}
