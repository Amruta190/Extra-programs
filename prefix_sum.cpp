#include<iostream>
using namespace std;
int prefix(int q,int n,int ar[])
{
    for(int i=q;i<n;i++)
    {
        int sum=0;
        for(int j=q;j<=i;j++)
            sum+=ar[j];
        if(sum<0)
            return i;
    }
    return -1;
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int dp[n][n],a[n],k,ans;
    int cnt=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>=0)
        {
            k=prefix(i,n,arr);
            if(k==-1)
            {
                ans=n-i;
                break;
            }
            else
            {
                cnt+=1;
                for(int p=k;p<n-1;p++)
                    arr[p]=arr[p+1];
                k=prefix(i,n-i-cnt,arr);
                if(k==-1)
                {
                    ans=n-i-cnt;
                    break;
                }
            }
        }
        cout<<"Hello";
    }
    cout<<ans;
}