package GameOOP;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        //Game setting
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this let the window properly close when user clicks "x" bottom
        window.setResizable(false); // false: we cannot resize window
        window.setTitle("2D adventure"); // set game title
        
        GamePanel gamePanel = new GamePanel(); //khai báo class 
        window.add(gamePanel); //add gamePanel to window
        
        window.pack(); //causes this window to be sized to fit the preferred size and layouts of its sub-components (=GamePanel) 
        
        window.setLocationRelativeTo(null);// null : not specify the location of the window = the window will be displayed at the center of the screen
        window.setVisible(true); //true: so we can see this window
        //Game setting

        gamePanel.startGameThread();


    }

    
}
