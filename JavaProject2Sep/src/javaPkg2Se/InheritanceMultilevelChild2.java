package javaPkg2Se;

public class InheritanceMultilevelChild2 extends InheritanceMultilevelChild1 {
	public void Sum2()
	{
		System.out.println("Child2 class sum");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceMultilevelChild2 obj=new InheritanceMultilevelChild2();
		obj.Sum(3);
		obj.Sum(2,4);
		obj.Sum2();
	}

}
