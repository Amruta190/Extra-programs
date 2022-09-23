#include <stdio.h>
#include<stdlib.h>
int arr[100];
int cmpfunc (const void * a, const void * b) 
{
   return ( *(int*)a - *(int*)b );
}
int add(int st,int end)
{
    int sum=0;
    for(int i=st;i<end;i++)
        sum+=arr[i];
    return sum;
}
int main()
{
    char temp;
    int j = 0;
    while (1)
    {
        scanf("%d%c", &arr[j++], &temp);
        if (temp == '\n')
            break;
    }
    // qsort(arr, j, sizeof(int), cmpfunc);
    for(int i=1;i<j;i++)
    {
        int tmp1=add(0,i);
        int tmp2=add(i,j);
        if(tmp1==tmp2)
        {
            printf("%d",tmp1);
            break;
        }
    }
}