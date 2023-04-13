package lab4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Ex5_DrawSpirals extends JPanel {
    int choice;
    public Ex5_DrawSpirals(int choice){
        this.choice = choice;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Dimension d = getSize();
        int m = 50;
        int n = m;
        int x = d.width/2;
        int y = d.height/2;
        g.setColor(Color.black);
        if (choice == 1){
            int turn = 1;
            int step = 0;
            while(x <= d.width && y <= d.height){
                int oldX = x;
                int oldY = y;
                if (turn == 1)
                    y += n;
                else if (turn == 2)
                    x -= n;
                else if (turn == 3)
                    y -= n;
                else if (turn == 4)
                    x += n;
                step++;
                turn++;
                g.drawLine(oldX,oldY,x,y);
                if (turn == 5)
                    turn = 1;                
                if (step == 2){
                    step = 0;
                    n += m;
                }
            }
        }
        else{
            n = 0;
            while(x >= 0 && y >= 0){
                int oldX = x;
                int oldY = y - m/2;
                n += m;
                g.drawArc(oldX, oldY, n, n, 180, -180);
                x = oldX - m;
                y = oldY - m/2;
                n += m;
                g.drawArc(x, y, n, n, 0, -180);
            }
        }
    }     
}
