import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Matrix on 14.11.2014.
 */
public class TestEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPass = encoder.encode("mobile");
        System.out.println(hashedPass);
        System.out.println(hashedPass.length());

        String encodedPassword = "$2a$10$KQJBflw5ecZQ4SHI0LbG/emOkWJ5RxkdPvTbVgU.Y9g1Iw4b/ohqC";
        boolean matches = encoder.matches("mobile", encodedPassword);
        System.out.println(matches);
        //Login - mobile@mobile
        //Pass - mobile
    }
}
