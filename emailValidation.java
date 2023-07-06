import java.util.regex.Pattern;
import java.util.*;

public class emailValidation {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        String email = in.next();

        boolean isValid = validateEmail(email);

        if (isValid) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }
    }

    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9](?!.*[._-]{2})[a-zA-Z0-9._-]*[a-zA-Z0-9]@[A-Za-z0-9.-]+$";

        return Pattern.matches(regex, email);
    }
}
