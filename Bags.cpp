#include<iostream>
#include<vector>
using namespace std;
int main()
{
    int x,y,flag=0,k;
    cin>>x>>y;
    for(int i=1;i<=x+y;i++)
    {
        if(x+y==i*(i+1)/2)
        {
            flag=1;
            k=i;
        }
    }
    if(flag==0)
        cout<<-1;
    if(flag==1)
    {
        int sum=0,cnt=0;
        for(int j=k;j>=0;j--)
        {
            sum+=j;
            cnt+=1;
            if(sum>=x)
            {
                cout<<cnt;
                break;
            }
        }
    }
}