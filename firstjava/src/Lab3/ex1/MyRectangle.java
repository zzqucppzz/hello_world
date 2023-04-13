package Lab3.ex1;

public class MyRectangle extends MyBoundedShape{
    private int width;
    private int height;
    public MyRectangle(int width,int height){
        this.width = width;
        this.height = height;
    };
    public void Draw(){
        System.out.println("This is a rectangle");
        for(int i = 0; i < height;i++){
            for(int j = 0; j < width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public double GetArea(){
        return width*height;
    }
}
