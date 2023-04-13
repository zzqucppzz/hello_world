package Lab1;
import java.util.ArrayList;
public class Order {
    private int ID;
    ArrayList<Item> items = new ArrayList<Item>();
    Order(int ID){
        this.ID = ID;
    }
    public void addItem(Item item){
        items.add(item);
    }

    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    public double calculateAverageCost(){
        if (items.size() == 0)
            return 0.0;
        else{
            double sum = 0;
            for(int i = 0; i < items.size();i++)
                sum += items.get(i).getPrice();
            return (double) sum / (items.size());
        }
    }   
}
