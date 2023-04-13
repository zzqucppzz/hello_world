package lab4;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Ex6 {
    public static void main(String[] args){
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
