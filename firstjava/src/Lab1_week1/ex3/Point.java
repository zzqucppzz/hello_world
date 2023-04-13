package Lab1_week1.ex3;

public class Point {
    private double x;
    private double y;
    Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    double distance(Point target){
        return Math.sqrt((target.x-this.x)*(target.x-this.x)+(target.y-this.y)*(target.y-this.y));
    }    
}
