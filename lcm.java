package com.pro.guvi;

import java.util.Scanner;

public class beta {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int i1=in.nextInt();
		int i2=in.nextInt();
		int r=0;
		while(r>0)
		{
			if(r%i1==0 && r%i2==0)
			{
				++r;
				
			}
		}
		
         System.out.println("LCM of no"+r);
	}

}
