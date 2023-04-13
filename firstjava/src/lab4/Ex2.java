package lab4;
import javax.swing.JFrame;
public class Ex2 {
    public static void main(String[] args){
        Ex2_DrawLine panel = new Ex2_DrawLine();
        JFrame ex2 = new JFrame();

        ex2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ex2.add(panel);
        ex2.setSize(250,250);
        ex2.setVisible(true);
    }
}
