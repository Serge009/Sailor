import org.matrix_soft.sailor.soap.units.UnitSet;
import org.matrix_soft.sailor.soap.units.UnitSetService;
import org.matrix_soft.sailor.soap.units.UnitSetServiceSoap;

import java.util.List;

/**
 * Created by Matrix on 24.11.2014.
 */
public class UnitSetServiceTest {
    private static long version = 0;
    private static String sessionId = "992e2581-c9f6-4350-ad1e-f97104dfa3a9";

    public static void main(String[] args) {
        UnitSetService unitSetService = new UnitSetService();
        UnitSetServiceSoap unitSetServiceSoap = unitSetService.getUnitSetServiceSoap();

        List<UnitSet> unitSet = unitSetServiceSoap.getUnitSetList(sessionId, version).getUnitSetList().getUnitSet();

        for (UnitSet set : unitSet) {
            System.err.println(set);
        }
    }
}
