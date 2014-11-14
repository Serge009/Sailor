import org.matrix_soft.sailor.mobile.model.LoginModel;
import org.matrix_soft.sailor.mobile.service.MobileLoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Matrix on 14.11.2014.
 */
public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        MobileLoginService service = context.getBean("mobileLoginServiceImpl", MobileLoginService.class);

        LoginModel model = new LoginModel();
        model.setEmail("mobile");
        model.setPassword("mobile");

        boolean login = service.login(model);
        System.out.println(login);
    }
}
