
#include <stdio.h>
#include<conio.h>
#include<string.h>
int main(void) 
{
	char str[100];
	int hash[26]={0},len,i;
	scanf("%s",str);
	len=strlen(str);
	for(i=0;i<len;i++)
		hash[str[i]-'a']++;
	for(i=0;i<len;i++)
	{
			if(hash[str[i]-'a']>1)
			{
				printf("%c",str[i]);
				hash[str[i]-'a']=0;
			}
	}
	return 0;
}
