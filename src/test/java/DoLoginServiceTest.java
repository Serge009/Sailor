import org.matrix_soft.sailor.soap.login.LoginService;
import org.matrix_soft.sailor.soap.login.LoginServiceResult;
import org.matrix_soft.sailor.soap.login.LoginServiceSoap;

/**
 * Created by Matrix on 17.11.2014.
 */
public class DoLoginServiceTest {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        LoginServiceSoap loginServiceSoap = loginService.getLoginServiceSoap();
        LoginServiceResult loginServiceResult = loginServiceSoap.doLogin("LOGO", "LOGO", 1, 0);



        System.out.println(loginServiceResult.getDescription());
        System.out.println(loginServiceResult.getReturnCode());
        System.out.println(loginServiceResult.getSessionId());

    }
}
