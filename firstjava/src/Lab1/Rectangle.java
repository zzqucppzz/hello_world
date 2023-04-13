package Lab1;


public class Rectangle {
    int width;
    int height;
    Rectangle(int width,int height){
        if (width <= 0||height <=0){
            System.out.println("Error");
            this.width = 1;
            this.height = 1;
        }
        else{
            this.width = width;
            this.height = height;
        }        
    }   
    void visualize(){
        for(int i = 0; i < this.height;i++)
                for(int j = 0; j < this.width;j++){
                    if (j == this.width - 1)
                        System.out.println("*");
                    else
                        System.out.print("*");
                }
        }
    }

