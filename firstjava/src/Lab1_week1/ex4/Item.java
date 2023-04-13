package Lab1_week1.ex4;

public class Item {
    private int ID;
    private String name;
    private double price;
    Item(int ID,String name,double price){
        this.setID(ID);
        this.setName(name);;
        this.setPrice(price);
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
