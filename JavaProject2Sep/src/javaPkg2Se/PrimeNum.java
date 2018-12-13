package javaPkg2Se;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
System.out.print("Please enter any number ");
Scanner obj= new Scanner(System.in);
int a= obj.nextInt();
	if(a%2==0)
	{
		System.out.println( "It is a prime number ");
	}
	else 
	{
	
	System.out.println( "It is not a prime number ");
	}
}

}
