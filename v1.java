import java.io.*;
import java.util.Scanner;
public class factorial 
{
static Scanner in=new Scanner(System.in);
static int fact=1;
static int i,n;

public static void main(String[] args)
{
	n=in.nextInt();
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
		
	}
	
	System.out.println(fact);
}

}
