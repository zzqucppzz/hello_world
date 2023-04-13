package lab4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Ex6_DrawBar extends JPanel {
    int len1;
    int len2;
    int len3;
    int len4;
    int len5;
    public Ex6_DrawBar(int len1,int len2,int len3,int len4,int len5){
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
        this.len4 = len4;
        this.len5 = len5;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Dimension d = getSize();
        int y = d.height/6;
        g.setColor(Color.black);
        g.fillRect(0, y, len1, y/2);
        g.setColor(Color.gray);
        g.fillRect(0, y*2, len2, y/2);        
        g.setColor(Color.MAGENTA);
        g.fillRect(0, y*3, len3, y/2);
        g.setColor(Color.green);
        g.fillRect(0, y*4, len4, y/2);
        g.setColor(Color.CYAN);
        g.fillRect(0, y*5, len5, y/2);    
    }    
}
