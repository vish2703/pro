#include<stdio.h>
void main()
{
    int arr[1000],i=0,n;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        if(arr[i] == i)
        {
            printf("%d ",arr[i]);
        }
    }
}
