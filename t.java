package Time_pass;

import java.util.ArrayList;
import java.util.Scanner;

public class t {
	
	static void max_heap(ArrayList<Integer> a,int n)
	{
		for (int i=0;i<(n/2);i++)
		{
			if (a.get(i-1)<a.get((2*i)-1))
			{
				int temp=a.get(i-1);
				a.set(i-1, a.get((2*i)-1));
				a.set((2*i)-1, temp);
				int c=i-1;
				while (c>0)
				{
					if (a.get((c/2)-1)<a.get(c))
					{
						int temp1=a.get((c/2)-1);
						a.set((c/2)-1, a.get(c));
						a.set(c, temp1);
					}
					c=(c/2)-1;
				}
			}
			for (int e:a)
				System.out.print(e+" ");
			System.out.println();
			if (2*i<n) 
			{
				if(a.get(i-1)<a.get((2*i)))
				{
					int temp=a.get(i-1);
					a.set(i-1, a.get((2*i)));
					a.set((2*i), temp);
					int c=i-1;
					while (c>0)
					{
						if (a.get(i/2)<a.get(c))
						{
							int temp1=a.get(c/2);
							a.set(c/2, a.get(c));
							a.set(c, temp1);
						}
						c=c/2;
					}
				}
				for (int e:a)
					System.out.print(e+" ");
				System.out.println();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//15 30 8 10 16 50 20 60 -1
		Scanner so=new Scanner (System.in);
		ArrayList <Integer> a= new ArrayList();	
		System.out.println("enter the elements or -1 to exit");
		int n=so.nextInt();
		int c=0;
		while (n!=-1)
		{
			a.add(n);
			c++;
			n=so.nextInt();
		}
		System.out.println(c);
		max_heap(a,c);
		for (int e:a)
			System.out.print(e+" ");

	}

}
