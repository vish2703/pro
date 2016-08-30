package vish;

import java.util.Scanner;


public class streve 
{

	public static void main(String[] args) 
	{
		
		Scanner in=new Scanner(System.in);
		int count=0;
		int[] stack=new int[100];
		char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t','u','v','w','x','y','z'};
		char b[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
				'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String s=in.nextLine();
		String[] str=s.split(" ");
		
for (int i = 0; i < str.length; i++) 
		{
			String string = str[i];
			char v[]=string.toCharArray();
			
			for (int j = 0; j < v.length; j++)
			{
				for (int j2 = 0; j2 < a.length; j2++) 
				{
					if(s.charAt(j)==a[j2])
					{
						count+=1;
						break;
					}
					
					else
						count+=1;
				}
			}
			
			
		}

		
		System.out.println(count);
	}
	
	
}
