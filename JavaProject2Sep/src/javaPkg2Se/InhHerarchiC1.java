package javaPkg2Se;

public class InhHerarchiC1 extends InhHerarchicalP1 {
	public void sum1 (int a)
	{
		System.out.println("Child1 class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InhHerarchiC1 obj=new InhHerarchiC1();
		obj.sum1(2);
	}
}
