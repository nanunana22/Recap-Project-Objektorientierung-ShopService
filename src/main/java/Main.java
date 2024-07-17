import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopService shopService = new ShopService();
        System.out.println(shopService.allOrders(OrderStatus.COMPLETED));
        List<String> myList = new ArrayList<String>();
        myList.add("1");
        shopService.addOrder(myList);
        System.out.println(shopService.allOrders(OrderStatus.PROCESSING));
    }
}
