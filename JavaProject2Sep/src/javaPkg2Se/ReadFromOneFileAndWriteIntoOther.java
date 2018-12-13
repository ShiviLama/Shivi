package javaPkg2Se;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFromOneFileAndWriteIntoOther {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("C:\\Program Files (x86)\\Selenium\\shivi2.txt");
FileReader fr=new FileReader(f);
BufferedReader br= new BufferedReader(fr);
File f1=new File("C:\\Program Files (x86)\\Selenium\\shivi3.txt");
FileWriter fw=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fw);
String s;
while ((s=br.readLine())!=null)
{
System.out.println(s);
bw.write(s);
bw.newLine();
	
}
bw.close();
	}

}
