package GameOOP;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener { //KeyListener: the listener interface for receiving keyboard events (keystrokes) //automatically create unimplemented method (keyTyped/keyPressed/keyReleased and KeyEvent)
    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {//just now,we donot use this method
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode(); //getKeyCode() return the integer keyCode associated with the key in this event
        if (code == KeyEvent.VK_W){ //"W" trong KeyEvent 
            upPressed = true;
        }
        if (code == KeyEvent.VK_S){
            downPressed = true;
        }
        if (code == KeyEvent.VK_A){
            leftPressed = true;
        }
        if (code == KeyEvent.VK_D){
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W){ //"W" trong KeyEvent 
            upPressed = false;
        }
        if (code == KeyEvent.VK_S){
            downPressed = false;
        }
        if (code == KeyEvent.VK_A){
            leftPressed = false;
        }
        if (code == KeyEvent.VK_D){
            rightPressed = false;
        }        
    }
    
}
