package File_Handling;

import java.io.*;
import java.util.*;

public class Sort_Roll {

public static void main(String[] args) throws Exception {
		
		BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\testout.txt"));
		FileWriter fw=new FileWriter("C:\\Users\\asus\\Desktop\\testout1.txt");
		
		String line=fr.readLine();
		ArrayList<String> l = new ArrayList<String>();
		while (line !=null)
		{
			if (line.charAt(0)=='2')
			l.add(line);
			line=fr.readLine();
		}
		Collections.sort(l);
		Collections.reverse(l);
		for(String a:l)
			fw.write(a+"\n");
		fw.close();
		

	}

}
