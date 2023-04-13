package Lab1;

public class Point {
    private double x;
    private double y;
    Point(double x,double y){
        this.setX(x);
        this.setY(y);
    }
    void setX(double x){
        this.x = x;
    }
    void setY(double Y){
        this.y = Y;
    }
    
    double distance(Point target){
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(target.x);
        System.out.println(target.y);
        return Math.sqrt((target.x-this.x)*(target.x-this.x)+(target.y-this.y)*(target.y-this.y));
    }
}

