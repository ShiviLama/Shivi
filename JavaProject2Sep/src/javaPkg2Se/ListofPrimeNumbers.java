package javaPkg2Se;

import java.util.Scanner;

public class ListofPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Please a number: ");
		int a= obj.nextInt();
		for(int i=a-1; i>=1;i--)
		{
			a=a*i;
		}
		System.out.println(a);
	}

}
