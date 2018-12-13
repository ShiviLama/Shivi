package javaPkg2Se;

public class InhHerarchicalC2 extends InhHerarchicalP1  {
	public void sum1 (int a)
	{
		System.out.println("Child2 class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InhHerarchicalC2 obj=new InhHerarchicalC2();
		obj.sum1(2);
	}

}
