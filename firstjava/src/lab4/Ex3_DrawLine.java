package lab4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Ex3_DrawLine extends JPanel {
    int choice;
    public Ex3_DrawLine(int choice){
        this.choice = choice;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Dimension d = getSize();
        int n = 15;
        int upX = d.width/n;
        int upY = d.height/n;
        g.setColor(Color.black);
        if (choice == 1)
            for(int i = 0; i < n;i++){
                g.drawLine(0, 0, i*upX, d.height-i*upY);
            }
        else{
            for(int i = 0; i < n;i++){
                g.drawLine(0, 0, i*upX, d.height-i*upY);
                g.drawLine(d.width, 0, i*upX, i*upY);
                g.drawLine(0,d.height, i*upX, i*upY);
                g.drawLine(d.width,d.height,i*upX, d.height-i*upY);
            }            
        }
    }    
}
