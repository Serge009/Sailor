import org.matrix_soft.sailor.soap.products.Product;
import org.matrix_soft.sailor.soap.products.ProductService;
import org.matrix_soft.sailor.soap.products.ProductServiceSoap;

import java.util.List;

/**
 * Created by Matrix on 24.11.2014.
 */
public class ProductServiceTest {
    private static long version = 0;
    private static String sessionId = "992e2581-c9f6-4350-ad1e-f97104dfa3a9";

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        ProductServiceSoap productServiceSoap = productService.getProductServiceSoap();

        List<Product> products = productServiceSoap.getProductList(sessionId, version).getProductList().getProduct();

        for (Product product : products) {
            System.err.println(product);
        }
    }
}
