package Lab1;

public class Triangle {
    int len1;
    int len2;
    int len3;
    Triangle(int len1,int len2,int len3){
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
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
