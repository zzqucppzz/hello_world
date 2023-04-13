package Lab3.ex4;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(float x,float y,float z){
        super(x,y);
        this.setZ(z);
    };
    public Point3D(){
    };
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] result = {this.getX(),this.getY(),z};
        return result;
    }
    public String toString(){
        return "(" + this.getX() + "," + this.getY() + "," + z +")";
    }
    public int check(){
        return 0;
    }
}
