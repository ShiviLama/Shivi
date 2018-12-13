package javaPkg2Se;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
	
public static void main(String[] args) throws IOException 
{
int a;
File f= new File("C:\\Program Files (x86)\\Selenium\\shivi2.txt");
FileReader fr=new FileReader(f);
BufferedReader br= new BufferedReader(fr);
String s;
/*while((a=fr.read())!=-1)
{
System.out.print((char)a);	//Read char by Char
}
*/
while((s=br.readLine())!=null)
{
System.out.print(s);	
}
//br.close();
File f1= new File("C:\\Program Files (x86)\\Selenium\\shivi3.txt");
FileWriter fw=new FileWriter(f1);
BufferedWriter bw= new BufferedWriter(fw);
bw.write("Hey My name is shiviDeepak");
bw.newLine();
bw.write("Hey My name is shiviDeepak");
bw.close();
}
}
