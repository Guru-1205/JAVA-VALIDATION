import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class passwordGenerator{
	public int length;
	public String generated;
	public boolean lengthChecker(int length)
	{
		if(length>=8 && length<=16)
		{
			this.length=length;
			return true;
		}
		return false;
	}
	public String passcodeGenerator()
	{
		generated="";
		int randomIndex;
		String charset="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		for(int i=0;i<length;i++)
		{
			randomIndex = (int) Math.floor(Math.random() * charset.length());
			generated+=charset.charAt(randomIndex);
		}
		while(true)
			if(verification())
				break;
			else{
				passcodeGenerator();
			}
		return generated;
	}
	public boolean verification()
	{
		return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*]).+$",generated);
	}
	public static void main(String s[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the password length :");
		passwordGenerator pg=new passwordGenerator();
		while(true)
		{	
			if(pg.lengthChecker(in.nextInt()))
				break;
			System.out.println("Re-enter the password length , since password length should be between 8 and 16 characters");
		}
		System.out.println("the generated passcode is :"+pg.passcodeGenerator());
		
	}
}