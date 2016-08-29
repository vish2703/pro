package vishal;

import java.util.Scanner;

public class revstr 
{

	public static void main(String[] args) 
	{
		
		String s;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
				
			String s1=new StringBuffer(str[i]).reverse().toString();
				//System.out.print(str[i]);
			System.out.print(s1+" ");
		}
		
