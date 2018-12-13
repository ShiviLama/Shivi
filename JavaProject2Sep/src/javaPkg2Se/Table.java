package javaPkg2Se;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Please a number: ");
		int a= obj.nextInt();
		for(int i=1; i<=10;i++)
		{
			int b=a*i;
			System.out.println(b);
		}
		
	}
	}

