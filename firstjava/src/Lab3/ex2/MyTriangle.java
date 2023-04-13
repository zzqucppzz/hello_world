package Lab3.ex2;

public class MyTriangle {
    private MyPoint v1 = new MyPoint(0,0);
    private MyPoint v2 = new MyPoint(0, 0);
    private MyPoint v3 = new MyPoint(0, 0);
    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    };
    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    };

    public String toString(){
        return "MyTriangle[v1=("+v1.getX()+","+v1.getY()+"),v2=("+v2.getX()+","+v2.getY()+"),v3=("+ v3.getX() + "," + v3.getY() + ")]";
    };
    public double getPerimeter(){
        return this.distance(v1, v2)+this.distance(v2, v3)+this.distance(v1, v3);
    };
    public String getType(){
        double len1 = this.distance(v1, v2);
        double len2 = this.distance(v2, v3);
        double len3 = this.distance(v1, v3);
        if (len1 + len2 > len3 && len1 + len3 > len2 && len2 + len3 > len1){
            if (len1 == len2 && len1 == len3)
                return "Equilateral";
            else if (len1 == len2 || len2 == len3 || len1 == len3)
                return "Isosceles";
            else
                return "Scalene";
        }
        else
            return "Not Triangle";
    };
    public double distance(MyPoint v1,MyPoint v2){
        int x = v1.getX() - v2.getX();
        int y = v1.getY() - v2.getY(); 
        return Math.sqrt(x*x+y*y);
    };
}
