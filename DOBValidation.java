import java.util.*;
import java.util.regex.Pattern;

public class DOBValidation
{
	public static void main(String s[])
	{
		Scanner in=new Scanner(System.in);
		String dob=in.next();
		String arr[];
		int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int month,day;
		if(Pattern.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}",dob)){
			arr=dob.split("-",3);
			month=Integer.parseInt(arr[1]);
			day=Integer.parseInt(arr[2]);
			if(month<=12)
			{
				if(day<=days[month-1])
				{
					System.out.println("valid");
				}
				else
				{
					System.out.println("Check the day");
				}
			}
			else
			{
				System.out.println("Check the month");
			}
		}
		else
			System.out.println("invalid");
	}
}