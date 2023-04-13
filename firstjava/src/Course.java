public class Course {
    public static void main(String[] args){
        int width = 20;
        int height = 10;
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
}
