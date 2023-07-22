import java.util.*;

public class shiftCipher
{
	Random random = new Random();
	int key=random.nextInt(1,27);
	public String encryption(String pt)
	{
		String ct="";
		for(int i=0;i<pt.length();i+=1)
		{
			ct+=(char)(((int)(pt.charAt(i))+key-65)%25+65);
		}
		return ct;
	}
	public String decryption(String ct)
	{
		String pt="";
		int x;
		for(int i=0;i<ct.length();i+=1)
		{
			x=(((int)(ct.charAt(i)))-key-65);
			if(x<0)
				pt+=(char)((x+26)%26+65);
			else
				pt+=(char)(x%25+65);
		}
		return pt;
	}
	public int bruteForce(String ct,String pt)
	{
		int k=0,x=0;
		String ptl="";
		while(k<26)
		{
			for(int i=0;i<ct.length();i+=1)
			{
			x=(((int)(ct.charAt(i)))-k-65);
			if(x<0)
				ptl+=(char)((x+26)%26+65);
			else
				ptl+=(char)(x%26+65);
			}
			if(ptl.compareTo(pt)==0)
				return k;
			ptl="";
			k=k+1;	
			
		}
		return k;
	}
	public static void main(String s[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the plain text :");
		String pt=in.next();
		shiftCipher cc=new shiftCipher();
		System.out.println("The corresponding Cipher text :"+cc.encryption(pt));
		System.out.println("Enter the cipher text :");
		String ct=in.next();
		System.out.println("The corresponding Plain text :"+cc.decryption(ct));
		System.out.println("Brute force Attack :"+cc.bruteForce("KHOOR","HELLO"));
		
	}
}