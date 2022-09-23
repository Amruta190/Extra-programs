#include<iostream>
using namespace std;
int find(int n,int dp[],int m)
{
    if(n==0)
        return 1;
    if(dp[n]!=-1)
        return dp[n];
    int c=0;
    for(int i=1;i<m+1;i++)
    {
        if(n-i>=0)
            c=c+find(n-i,dp,m);
    }
    dp[n]=c;
    return dp[n];
}
int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        int s,m;
        cin>>s;
        cin>>m;
        int dp[s+1];
        for(int i=0;i<s+1;i++)
            dp[i]=-1;
        cout<<find(s,dp,m)<<"\n";
    }
}