package Lab1_week1.ex4;
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID of order");
        int orderID = scanner.nextInt();
        Order order = new Order(orderID);
        while (true){
            System.out.println("Enter ID of item:(0 to exist):");
            int itemID = scanner.nextInt();
            if (itemID == 0)
                break;
            String itemName = scanner.next();
            Double itemPrice = scanner.nextDouble();
            Item item = new Item(itemID,itemName,itemPrice);
            order.addItem(item);
        }
        System.out.print("Average cost:");
        System.out.println(order.calculateAverageCost());
    }
}
