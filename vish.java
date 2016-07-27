public class revstr 
{

	public static void main(String[] args) 
	{
		String s="hcl technologies limited";
		String str[]=s.split(" ");
		
		
		
		for(int i=0;i<str.length;i++)
		{
				
			String s1=new StringBuffer(str[i]).reverse().toString();
			System.out.println(str[i]);
			}
			}
			}
