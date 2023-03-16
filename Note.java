package Edit_note;

import java.io.FileReader;
import java.io.FileWriter; 

public class Note {

	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("C:\\Users\\hp\\Desktop\\Add.csv");
		FileWriter fw=new FileWriter("C:\\Users\\hp\\Desktop\\testout.txt");
        int i;    
        char s=' ';
        while((i=fr.read())!=-1)
        {
        	if ((char)i!=',')
        	{
        		s=(char)i;
        		fw.write(s);
        	}
        		
        	else
        	{
        		if (s==',')
        			break;
        		else
        		{
        			fw.write(',');
        			s=',';
        		}
        		
        	}
        }
        fw.close();
        fr.close();

	}

}
