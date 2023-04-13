package lab4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Ex4_DrawLine extends JPanel{
    int choice;
    public Ex4_DrawLine(int choice){
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
                g.drawLine(0,i*upY,(i+1)*upX,d.height);
            }
        else{
            for(int i = 0; i < n;i++){
                g.drawLine(0,i*upY,(i+1)*upX,d.height);
                g.drawLine(0,d.height-i*upY,(i+1)*upX,0);
                g.drawLine(d.width,i*upY,d.width - (i+1)*upX,d.height);
                g.drawLine(d.width,d.height-i*upY,d.width - (i+1)*upX,0);
            }            
        }
    }    
}
