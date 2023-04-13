package Lab1_week1.ex1;

public class Rectangle {
    private int width;
    private int height;
    Rectangle(int width,int height){
        int count = 0;
        if (width < 0){
            width = 1;
            count++;
        }
        if (height < 0){
            height = 1;
            count++;
        }
        if (count != 0)
            System.out.println("Error message");
        this.setWidth(width);
        this.setHeight(height);
    } 
    void setWidth(int width){
        this.width = width;
    }   
    void setHeight(int height){
        this.height = height;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    void visualize(){
        for(int i = 0; i < height;i++)
            for(int j = 0;j < width;j++){
                if (j == width - 1){
                    System.out.println("*");
                }
                else{
                    System.out.print("*");
                }
            }
    }

}