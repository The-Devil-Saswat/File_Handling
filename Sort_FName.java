package File_Handling;

import java.io.*;
import java.util.*;

public class Sort_FName {

public static void main(String[] args) throws Exception {
		
		BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\testout1.txt"));
		FileWriter fw=new FileWriter("C:\\Users\\asus\\Desktop\\testout2.txt");
		
		String line=fr.readLine();
		ArrayList<String> l = new ArrayList<String>();
		while (line!=null)
		{
			int end=0;
			
			for (int i=0;i<line.length();i++)
			{
				if (line.charAt(i)==',')
				{
					end=i;
					break;
				}
			}
			
			String s=line.substring(end+1)+line.substring(0,end+1);
			l.add(s);
			line=fr.readLine();
		}
		Collections.sort(l);
		for(String a:l)
			fw.write(a+"\n");
		fw.close();
		

	}

}
