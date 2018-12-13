package javaPkg2Se;

public class StringRev {
	public static void main(String[] args) {
		String s1="My Name is Shivi";
		
		//String[] s2="";
		String[] s2=s1.split(" ");
		//System.out.println(s2);
		int l=s2.length;
		System.out.println(l);
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.print(s2[i].concat(" "));
			//System.out.println(" ");
			 for(int j=s2.length-1;j>=0;j--) {
				 System.out.print(s2[j]);
			 }
			 
		}
	}
	
}
