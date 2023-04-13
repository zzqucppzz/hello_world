package Lab1;
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int orderID = scanner.nextInt();
        Order order = new Order(orderID);
        while (true){
            System.out.println("Enter ID (0 to exist):");
            int itemID = scanner.nextInt();
            if (itemID == 0)
                break;
            String itemName = scanner.next();
            Double itemPrice = scanner.nextDouble();
            Item item = new Item(itemID,itemName,itemPrice);
            order.addItem(item);
        }
        System.out.println(order.calculateAverageCost());
    }
}
