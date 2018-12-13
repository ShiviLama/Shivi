package javaPkg2Se;

import java.util.Scanner;

public class ScannerExp2 {

	public int Sum(int a,int b)
	{
		int S1=a+b;
		return S1;
		//System.out.println(c);
	}
	public int Sub(int a,int b)
	{
		int S1=a-b;
		return S1;
		//System.out.println(c);
	}
	public int Mul(int a,int b)
	{
		int M1=a*b;
		return M1;
		//System.out.println(c);
	}
	public void Div(int a,int b)
	{
		float D1=a/b;
		//return D1;
		System.out.println(D1);
	}		
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a: ");
		int a= s.nextInt();
		System.out.println("enter the value of b: ");
		int b= s.nextInt();
	ScannerExp2 obj=new ScannerExp2();
			int S1= obj.Sum(a, b);
			int S2=obj.Sum(S1, b);
			int Sub=obj.Sub(S2, b);
			int Mul=obj.Mul(Sub, b);
			obj.Div(Mul,b);
			
	}

}
