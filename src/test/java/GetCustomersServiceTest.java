import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
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
        String sessionId = "a020c20f-e91a-4075-a6f8-9c431d6b69df";

        CustomerService customerService = new CustomerService();
        CustomerServiceSoap customerServiceSoap = customerService.getCustomerServiceSoap();

        CustomerServiceResult customerList = customerServiceSoap.getCustomerList(sessionId, 0);
        List<Customer> customers = customerList.getCustomerList().getCustomer();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
