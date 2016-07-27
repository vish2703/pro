import java.io.*;
import java.util.Scanner;
public class factorial 
{
static Scanner in=new Scanner(System.in);
static int fact=1;
static int i,s;

public static void main(String[] args)
{
	s=in.nextInt();
	for(i=1;i<=s.legth;i++)
	{
		fact=fact*i;
		
	}
	
	System.out.println(fact);
}

}
