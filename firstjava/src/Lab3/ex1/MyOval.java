package Lab3.ex1;

public class MyOval extends MyBoundedShape{
    private int width;
    private int height;
    public MyOval(int width,int height){
        this.width = width;
        this.height = height;        
    }
    public void Draw(){
        int a = width / 2;
        int b = height / 2;
        for(int i = -b; i <= b;i++){
            for(int j = -a; j <= a ;j++){
                if ((j*j*b*b + i*i*a*a) <= a*a*b*b)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        System.out.println();
        }
    }
    public double GetArea(){
        return (double) 3.14*width*height / 4 ;
    }
}
