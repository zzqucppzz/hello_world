package Lab3.ex2;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(int x,int y){
        this.setX(x);
        this.setY(y);
    };
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
}
