import java.util.regex.Pattern;
import java.util.*;
public class passwordStrengthChecker {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        String password;
		System.out.println("Enter the password :");
        boolean isStrong;
		while(true){
		password=in.next();
		isStrong= isPasswordStrong(password);
        if (isStrong) {
            System.out.println("Password is strong.");
			break;
        } else {
            System.out.println("Password is weak , re-enter the password ");
        }
		}
    }

    public static boolean isPasswordStrong(String password) {
        boolean hasMinimumLength = Pattern.matches(".{8,}", password);
		if(!hasMinimumLength)
		{
			System.out.println("The password should be atleast of 8 characters"); 
			return false;
		}
        boolean hasUppercase = Pattern.matches(".*[A-Z].*", password);
		if(!hasUppercase)
		{
			System.out.println("The password should have atleast one uppercase character"); 
			return false;
		}
        boolean hasLowercase = Pattern.matches(".*[a-z].*", password);
		if(!hasLowercase)
		{
			System.out.println("The password should have atleast one lowercase character"); 
			return false;
		}
        boolean hasDigit = Pattern.matches(".*\\d.*", password);
		if(!hasDigit)
		{
			System.out.println("The password should have atleast a decimal"); 
			return false;
		}
        boolean hasSpecialChar = Pattern.matches(".*[@#$%^&*].*", password);
		if(!hasSpecialChar)
		{
			System.out.println("The password should have atleast one special character"); 
			return false;
		}
        return true;
    }
}
