import java.util.regex.Pattern;
import java.util.*;

public class phoneNumberValidation {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        String phoneNumber = in.next();
		
		if(Pattern.matches("^[+][0-9]{1}\s[0-9]{3}-[0-9]{3}\s[0-9]{4}",phoneNumber))
			System.out.println("International format");
		else if(Pattern.matches("^[(][0-9]{3}[)]{1}[0-9]{3}-[0-9]{4}",phoneNumber))
			System.out.println("National format");
		else if(Pattern.matches("^[+][0-9]{10}",phoneNumber))
			System.out.println("E.164 Format");
		else
			System.out.println("Invalid format");
      
    }

}
