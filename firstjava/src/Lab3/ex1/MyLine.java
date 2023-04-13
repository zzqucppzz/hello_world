package Lab3.ex1;

public class MyLine extends MyShape{
    private int length;
    public MyLine(int length){
        this.length = length;
    }
    public void Draw(){
        System.out.println("This is a line:");
        for(int i = 0;i < length;i++)
            System.out.print("*");
        System.out.println();
    }
    public int check(){
        return 0;
    };
}
