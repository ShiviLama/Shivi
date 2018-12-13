package javaPkg2Se;

import java.util.Scanner;

public class SwapWithout3rdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter any 2 numbers ");
		System.out.print("Value of a:");
		Scanner obj= new Scanner(System.in);
		int a= obj.nextInt();
		System.out.print("Value ofb:");
		int b= obj.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping value of a is: "+a );
		System.out.println("After swapping value of  b is: "+b);
	}

}
