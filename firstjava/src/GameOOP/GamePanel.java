package GameOOP;

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import entity.Player;

public class GamePanel extends JPanel implements Runnable{ //Runnable: a key to use a thread
    // Screen setting
    final int originalTileSize = 16; //means 16x16 tile (become default size of the player, character,NPCs and map tile)
    final int scale = 3; // purpose is to scale the size
    public final int tileSize = originalTileSize * scale; // 48x48 tile
    final int maxScreenCol = 16; // 16 column
    final int maxScreenRow = 12; // 12 row
    final int screenWidth = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; //576 pixels
    //

    //FPS
    int FPS = 60;

    KeyHandler keyH = new KeyHandler();

    // Game Mechanic
    Thread gameThread; //*starting a thread //*Thread is sth you can start and stop, once a thread started,it keeps your program running until you stop it 
    // Game Mechanic

    Player player = new Player(this,keyH);
    
    //Set player's default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    //Game setting
    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight)); //setPreferredSize(new Dimension(width,height)) = set the size of this class (JPanel)
        this.setBackground(Color.black); //set background as black
        this.setDoubleBuffered(true); //*if set true, all the drawing from this component will be done in an offscreen painting buffer
        //in short, enabling this can improve game's rendering performance
        //get keyboard
        this.addKeyListener(keyH); //recognize key input
        this.setFocusable(true); //setFocusable(true) : with this,this GamePanel can be "focused" to receive key input
        //get keyboard
    }
    //Game setting

    // Game Mechanic
    public void startGameThread(){
        gameThread = new Thread(this);//instantiate a thread //passing GamePanel to thread's constructor 
        gameThread.start(); //let start a thread //automatically call run method
    }

    @Override
    //sleep method (construct to run a game)
    /*public void run() { //when object implementing interface Runnable is used to create a thread, starting the thread causes the object's run method to be called in that separatory execution thread 
    //game loop outline
        double drawInterval = 1000000000/FPS; //1 second or 1 billion nanosecond/FPS =0.01666 seconds
        double nextDrawTime = System.nanoTime() + drawInterval;
        while (gameThread != null){ //as long as gameThread exists, it repeats func in brackets
            
            //long currentTime = System.nanoTime(); //returns the current value of the running Java Virtual Machine's high-resolution time source
            //(tuương tự) long currentTime2 = System.currentTimeMillis(); //1000 millisecond = 1 second
            
            // 1 UPDATE: update in4 such as character position
            update();
            // 2 DRAW: draw the screen with the updated in4
            repaint(); //*this is how to call paintComponent method
            
            try { 
            double remainingTime = nextDrawTime - System.nanoTime();
            remainingTime = remainingTime/1000000;
            if (remainingTime < 0){
                remainingTime = 0;
            }
            Thread.sleep((long) remainingTime); //Thread.sleep() chỉ nhận milliseconds nên phải chuyển từ nanosecond thành millisecond //sẽ cho thread ngủ trong 1 thời gian cố định
            nextDrawTime += drawInterval;
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    //
    }
    */
    public void run(){
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0; 
        int drawCount = 0;
        while(gameThread != null){
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;
            if (delta >= 1){
                update();
                repaint();
                delta--;
                drawCount++;             
            }
            // display FPS
            if (timer >= 1000000000){
                System.out.println("FPS:"+drawCount);
                timer = 0;
                drawCount = 0;
            }

            
        }
    }
    public void update(){
        player.update();
    }
    public void paintComponent(Graphics g){//*painComponent is one of standard methods to draw things on JPanel //Graphics : a class that has many functions to draw objects on the screen (imagine as pencil or paintbrush)
        super.paintComponent(g); //painComponent cũng là 1 method đc tạo sẵn trong java
        Graphics2D g2 = (Graphics2D) g;//change Graphics g to Graphics2D class //Graphics2D class extends the Graphics class to provide more sophisticated control over geometry, coordinate transformations, color management, and text layout
        player.draw(g2);
        g2.dispose(); //dispose() = dispose of this graphics context and release any system resources that it is using

    }   
    //
}
