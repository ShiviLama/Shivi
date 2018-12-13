package javaPkg2Se;

import java.util.Scanner;

import org.apache.xpath.operations.Equals;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a String: ");
	String s1=s.next();
	//System.out.println(s1);
	String s2="";
	int l=s1.length();
	System.out.println("Length of S1 is: "+l);
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	
	if(s2.equals(s1))
	{
		System.out.println("String is Palindrome.");
				
	}else
	{
		System.out.println(s2);
		System.out.println("String is not palindrome");
	}

	}

}
