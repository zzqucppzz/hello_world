package lab4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Ex2_DrawLine extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Dimension d = getSize();
        g.setColor(Color.black);
        g.drawLine(0, 0, d.width, d.height);

        g.drawLine(d.width, 0, 0, d.height);

        g.drawLine(d.width/2, 0, d.width/2, d.height);

        g.drawLine(0, d.height/2, d.width, d.height/2);
    }
}
