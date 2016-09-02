#include<stdio.h>
void main()
{
    int ar[1000],ar1[1000],n,i=0,inc=0,temp=0,check=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    for(i=0;i<n;i++)
    {
        temp=ar[i];
        while(temp>0)
        {
            ar1[inc]=temp%10;
            inc++;
            temp=temp/10;
        }
    }
    while(1)
    {
        check=0;
        for(i=0;i<inc-1;i++)
        {
            if(ar1[i] <ar1[i+1])
            {
                temp=ar1[i];
                ar1[i]=ar1[i+1];
                ar1[i+1]=temp;
                check=1;
            }
        }
        if(check == 0)
        {
            break;
        }
    }
    for(i=0;i<inc;i++)
    {
        printf("%d",ar1[i]);
    }
}
