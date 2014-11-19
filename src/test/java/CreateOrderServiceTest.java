import org.matrix_soft.sailor.soap.orders.Order;
import org.matrix_soft.sailor.soap.orders.OrderService;
import org.matrix_soft.sailor.soap.orders.OrderServiceSoap;

/**
 * Created by Matrix on 18.11.2014.
 */
public class CreateOrderServiceTest {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        OrderServiceSoap orderServiceSoap = orderService.getOrderServiceSoap();
        orderServiceSoap.createSaleOrder("ddd", new Order());
    }
}
