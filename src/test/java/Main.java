import org.matrix_soft.sailor.core.entity.Company;
import org.matrix_soft.sailor.core.entity.User;
import org.matrix_soft.sailor.core.entity.UserType;
import org.matrix_soft.sailor.core.service.CompanyService;
import org.matrix_soft.sailor.core.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SERGE on 13.11.2014.
 */
public class Main {

    private final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        CompanyService companyService = context.getBean("companyServiceImpl", CompanyService.class);
        UserService userService = context.getBean("userServiceImpl", UserService.class);

        Company company = companyService.findById(1);

        logger.info("{}", company);

        User user = new User();
        user.setCompany(company);
        user.setName("Name");
        user.setSurname("Surname");
        user.setEmail("Email");
        user.setUserType(UserType.MOBILE_USER);
        user.setPassword("some password");
        user.setUsername("Username");

        userService.save(user);

        logger.info("{}", user);
    }
}
