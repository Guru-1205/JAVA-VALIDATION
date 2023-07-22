//caesar cipher 
//shift cipher [ brute force attack ]

import java.util.*;

public class caesarCipher
{
	private int key=3;
	public String encryption(String pt)
	{
		String ct="";
		for(int i=0;i<pt.length();i+=1)
		{
			ct+=(char)(((int)(pt.charAt(i))+key-65)%26+65);
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
	public static void main(String s[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the plain text :");
		String pt=in.next();
		caesarCipher cc=new caesarCipher();
		System.out.println("The corresponding Cipher text :"+cc.encryption(pt));
		System.out.println("Enter the cipher text :");
		String ct=in.next();
		System.out.println("The corresponding Plain text :"+cc.decryption(ct));
	}
}