import org.matrix_soft.sailor.soap.firms.Firm;
import org.matrix_soft.sailor.soap.firms.FirmService;
import org.matrix_soft.sailor.soap.firms.FirmServiceResult;
import org.matrix_soft.sailor.soap.firms.FirmServiceSoap;

import java.util.List;

/**
 * Created by Matrix on 24.11.2014.
 */
public class FirmServiceTest {
    private static String password = "bjk1903@Sailor2014@!QwEhFkk";

    public static void main(String[] args) {
        FirmService firmService = new FirmService();
        FirmServiceSoap firmServiceSoap = firmService.getFirmServiceSoap();

        FirmServiceResult firmList = firmServiceSoap.getFirmList(password, "LOGO", "LOGO");
        List<Firm> firms = firmList.getFirmList().getFirm();

        for (Firm firm : firms) {
            System.err.println(firm);
        }

    }
}
