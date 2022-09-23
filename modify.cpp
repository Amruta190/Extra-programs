#include<iostream>
#include<vector>
using namespace std;
vector<int> arr{-128,-32,-8,-2,1,2,4,8,16,32,64,128};
int closest(int n)
{
    int min=100;
    for(int i=0;i<arr.size();i++)
    {
        if(min>abs(arr[i]-n))
            min=abs(arr[i]-n);
    }
    return min;
}
int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        int n;
        cin>>n;
        if(n==0)
        {
            cout<<0;
            break;
        }
        int k=n;
        int val=closest(n);
        while(val!=0)
        {
            cnt+=1;
            val=closest(val);
        }
        cout<<cnt;
    }
}