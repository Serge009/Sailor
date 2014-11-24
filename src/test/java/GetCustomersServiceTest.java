import org.matrix_soft.sailor.soap.customers.Customer;
import org.matrix_soft.sailor.soap.customers.CustomerService;
import org.matrix_soft.sailor.soap.customers.CustomerServiceResult;
import org.matrix_soft.sailor.soap.customers.CustomerServiceSoap;

import java.util.List;

/**
 * Created by Matrix on 19.11.2014.
 */
public class GetCustomersServiceTest {
    public static void main(String[] args) {
        String sessionId = "992e2581-c9f6-4350-ad1e-f97104dfa3a9";

        CustomerService customerService = new CustomerService();
        CustomerServiceSoap customerServiceSoap = customerService.getCustomerServiceSoap();

        CustomerServiceResult customerList = customerServiceSoap.getCustomerList(sessionId, 1387532348);

        System.out.println(customerList.getDescription());
        List<Customer> customers = customerList.getCustomerList().getCustomer();
        customers.forEach(System.out::println);
    }
}
