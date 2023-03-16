package File_Handling;

import java.io.*;

public class New {

public static void main(String[] args) throws Exception {
		
		BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\Add.csv"));
		FileWriter fw=new FileWriter("C:\\Users\\asus\\Desktop\\testout.txt");
		
		String line=fr.readLine();
		while (line !=null)
		{
			int c=0;
			if (line.charAt(0)!=',')
			{
				int x=0;
				for(int i=0;i<line.length();i++)
				{
					if (line.charAt(i)==',')
						c++;
					if(c==2)
						x=i;
				}
				String s=line.substring(0, x+1);
				fw.write(s+"\n");
			}
			line=fr.readLine();
		}
		fw.close();
		

	}

}
