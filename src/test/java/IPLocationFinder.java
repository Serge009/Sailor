import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * Created by Matrix on 17.11.2014.
 */
public class IPLocationFinder {
    public static void main(String[] args) {
        String ipAddress = "78.188.182.81";
        GeoIPService ipService = new GeoIPService();
        GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
        GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
        System.out.println(geoIP);
//        stub.getCountryName(ipAddress);
    }
}
