package Lab2;
public class Particle {
    private int x;
    private int y;
    private int check= -1;
    public Particle(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int check(){
        return check;
    }
    public void setCheck(int check){
        this.check = check;
    }
    String Move;
    enum Direction {
        North,North_East,East,South_East,South,South_West,West,North_West;
    }
    public void move(Direction direct,int width,int height,int Check){
        check = Check;
        switch(direct){
            case North:{
                if (y > 1)
                    y--;
                if (y == 1)
                    check = 4;
            break;
            }
            case North_East:{
                if (y > 1 && x < width - 2){
                    y--;
                    x++;
                }
                if (( y == 1)&&(x == width -2 )){
                    check = 5;
                }
                else{
                    if (y == 1){
                        check = 3;
                    }
                    else if (x == width - 2){
                        check = 7;
                    }
                }
            break;
            }
            case East: 
            if (x < width - 2)    
                x++;
            if (x == width - 2)
                check = 6;
            break;
            case South_East:{
                if (y < height - 2 && x < width - 2){
                    y++;
                    x++;
                }
                if (( y == height - 2)&&(x == width -2 )){
                    check = 7;
                }
                else{
                    if (y == height - 2){
                        check = 1;
                    }
                    else if (x == width - 2){
                        check = 5;
                    }
                }
            }
            break;
            case South: 
            if (y < height -2)    
                y++;
            if (y == height - 2)
                check = 0;
            break;
            case South_West:{
                if (y < height - 2 && x > 1){
                    y++;
                    x--;
                }
                if (( y == height - 2)&&(x == 1 )){
                    check = 1;
                }
                else{
                    if (y == height - 2){
                        check = 7;
                    }
                    else if (x == 1){
                        check = 3;
                    }
                }
            }
            break;
            case West:
            if (x > 1)
                x--;
            if (x == 1)
                check = 2;
            break;
            case North_West:{
                if (y > 1 && x > 1){
                    y--;
                    x--;
                }
                if (( y == 1)&&(x == 1 )){
                    check = 3;
                }
                else{
                    if (y == 1){
                        check = 5;
                    }
                    else if (x == 1){
                        check = 1;
                    }
                }
            }
            break;
        }
    }
}

