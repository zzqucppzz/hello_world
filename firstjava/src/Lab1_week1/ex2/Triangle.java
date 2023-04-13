package Lab1_week1.ex2;

public class Triangle {
    private double len1;
    private double len2;
    private double len3;
    Triangle(double len1,double len2,double len3){
        this.setLen1(len1);
        this.setLen3(len3);
        this.setLen3(len3);
    }
    void setLen1(double len1){
        this.len1 = len1;
    }
    public double getLen1(){
        return this.len1;
    }
    void setLen2(double len2){
        this.len2 = len2;
    }
    public double getLen2(){
        return this.len2;
    }
    void setLen3(double len3){
        this.len3 = len3;
    }
    public double getLen3(){
        return this.len3;
    }
    String verify(){
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
    }    
}
