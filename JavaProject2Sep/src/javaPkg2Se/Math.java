package javaPkg2Se;

public class Math {
public int Sum1(int a, int b)
{
	int c=a+b;
	return c;

}
public int Sub(int a, int b)
{
	int c=a-b;
	return c;

}
public int Mul(int a, int b)
{
	int c=a*b;
	return c;

}
public void Div(int a, int b)
{
	float c=a/b;
	//return c;
System.out.println("result is " +c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Math ref1=new Math();
int s1 = ref1.Sum1(10,2);
int s2=ref1.Sum1(s1, 2);
int sub1=ref1.Sub(s2, 2);
Math ref2=new Math();
int mul1 = ref2.Mul(sub1, 2);
ref1.Div(mul1, 2);
	}

}
