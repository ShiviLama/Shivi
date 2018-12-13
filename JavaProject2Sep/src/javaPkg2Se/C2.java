package javaPkg2Se;

public class C2 extends InheritanceConstThisSuperC1 {
	public C2()
	{
		super(45);
		System.out.println("Child Default Constructor");
	}
	public C2(int a)
	{
		this(12,45);
		
		System.out.println("Child 1 parameter Constructor");
	}
	public C2(int a, int b)
	{
		this();
		System.out.println("Child 2 parameter Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 obj=new C2(58);
		//obj.C2(12);
	}

}
