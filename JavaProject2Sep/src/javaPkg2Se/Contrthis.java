package javaPkg2Se;

public class Contrthis {
	public Contrthis()
	
	{
		this(23,5,6);
		System.out.println("Default Contructor");
	}
public Contrthis(int a)
	
	{
	this();
		System.out.println("1 parameter Contructor");
	}
public Contrthis(int a, int b)

{
	this(23);
	System.out.println("2 parameter Contructor");
}
public Contrthis(int a,int b,int c)

{
	System.out.println("3 parameter Contructor");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Contrthis obj1=new Contrthis();----Default Contructor
Contrthis obj=new Contrthis(4,9);
	}

}
