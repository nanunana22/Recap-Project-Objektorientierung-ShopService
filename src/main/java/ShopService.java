import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//Schreiben Sie eine Methode im ShopService, die eine Liste aller Bestellungen mit einem bestimmten Bestellstatus (Parameter)
//unter Verwendung von Streams zurückgibt.

public class ShopService {
    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderMapRepo();

    public Order addOrder(List<String> productIds) {
        List<Product> products = new ArrayList<>();
        for (String productId : productIds) {
            Product productToOrder = productRepo.getProductById(productId);
            if (productToOrder == null) {
                System.out.println("Product mit der Id: " + productId + " konnte nicht bestellt werden!");
                return null;
            }
            products.add(productToOrder);
        }


        Order newOrder = new Order(UUID.randomUUID().toString(), products, OrderStatus.PROCESSING);
        return orderRepo.addOrder(newOrder);

//        List<Order> allOrders = orderRepo.getOrders();
//        allOrders.stream()
//                .forEach(ShopService::printAllOrders);

//    static void printAllOrders(Order all) {
//        System.out.println(all);
    }
    public List<Order> allOrders(OrderStatus orderStatus){
        List<Order> myOrders = orderRepo.getOrders();
        List<Order> status = myOrders.stream()
                .filter(o -> o.orderStatus() == orderStatus)
                .toList();

        return status;

    }

}
