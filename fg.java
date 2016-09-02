import java.util.Scanner;

public class pangram 
{
              public static void main(String[] args)
              {
				Scanner sc=new Scanner(System.in);
				String s=sc.nextLine();
				int a=s.length();
				char cu[]=new char[a];
				cu=s.toCharArray();
				String s1="abcdefghijklmnopqrstuvwxyz";
				int r=s1.length();
				char cv[]=new char[r];
				cv=s1.toCharArray();
				char b;
				int temp=0;
				for (int i = 0; i < c.length; i++)
				{
					for(int j=0;j<r;j++)
					{
						if(cu[i]==cv[j])
						{
						temp++;
						}
					}
				}
				if(temp==r)
				{
					System.out.println("It is a pangram");
				}
				else
				{
					{
						System.out.println("It is not a pangram");
					}
				}
			}
}
