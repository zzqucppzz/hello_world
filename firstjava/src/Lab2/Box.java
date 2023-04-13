package Lab2;

import java.util.ArrayList;
import java.util.Random;

import Lab2.Particle.Direction;

public class Box {
    private static Box instance = null;
    private final ArrayList<Particle> particles;
    private final Random random = new Random();
    private final int width;
    private final int height;

    public Box(int width,int height){
        this.width = width;
        this.height = height;
        particles = new ArrayList<>();
        for(int i = 0; i < 3;i++)
            particles.add(new Particle(1+random.nextInt(width-2),1+random.nextInt(height-2)));
    }

    public static Box getInstance(int width, int height) {
        if (instance == null) {
            instance = new Box(width, height);
        }
        return instance;
    }

    public void update(){
        ArrayList<Particle> newParticle = new ArrayList<>();
        for(Particle particle : particles){
            int ran = random.nextInt(8);
            //Direction direct = Direction.values()[ran];
            if (particle.check() == -1)
                particle.move(Direction.values()[ran], width, height, ran);
            else
                particle.move(Direction.values()[particle.check()], width, height, particle.check());
            for(Particle subParticle : particles)
                if (subParticle != particle && subParticle.getX() == particle.getX() && subParticle.getY() == particle.getY()){
                    newParticle.add(new Particle(1+random.nextInt(width-2),1+random.nextInt(height-2)));
                    particle.setCheck(random.nextInt(8));
                    subParticle.setCheck(random.nextInt(8));
                    break;
                }
        }
        particles.addAll(newParticle);
    }

    public void draw(){
        char[][] box = new char[height][width];
        for(int i = 0; i < height;i++)
            for(int j = 0; j < width;j++)
                if (i == 0 || i == height - 1)
                    box[i][j] = '-';
                else
                    if (j == 0||j == width - 1)
                        box[i][j] = '|';
                    else
                        box[i][j] = ' ';
        for(Particle particle : particles){
            box[particle.getY()][particle.getX()] = '*';
        }
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width;j++)
                System.out.print(box[i][j]);
            System.out.println();
        }
    }
    
    public int countParticles(){
        return particles.size();
    }

}





