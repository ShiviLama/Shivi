package javaPkg2Se;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputAndWriteInFile {
	public static void main(String[] args) throws IOException 
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a string1: ");
	String s=obj.next();
	System.out.println("Enter a string2: ");
	String s2=obj.next();
	System.out.println("Enter a string3: ");
	String s3=obj.next();
	System.out.println(s);
	System.out.println(s2);
	System.out.println(s3);

	File f= new File("C:\\Program Files (x86)\\Selenium\\shivi3.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	for(int i=0;i<10;i++)
	{
		bw.write(s);
		bw.newLine();
		bw.write(s2);
		bw.newLine();
		bw.write(s3);
			
	}
	bw.close();
	}
	
	
}
