#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main()
{
    long int i,j,arr[100],n,h;
    cin>>n;
    vector<long int>g2;
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
        if(!count(g2.begin(),g2.end(),arr[i]))
            g2.push_back(arr[i]);
    }
    if(g2.size()==1)
    {
        cout<<n;
        exit(0);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<=n-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                long int tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
        }
    }
    vector<long int>g1;
    long int k=n,p=0,q=1;
    while((q+1)!=k)
    {
        n=k;
        while((q+1)!=n)
        {
            long int a=arr[p];
            long int b=arr[q];
            h=arr[n-1];
            if((a+b)>h)
            {
                if((b+h)>a)
                {
                    if((a+h)>b)
                    {
                        if(!count(g1.begin(),g1.end(),a))
                            g1.push_back(a);
                        if(!count(g1.begin(),g1.end(),b))
                            g1.push_back(b);
                        if(!count(g1.begin(),g1.end(),h))
                            g1.push_back(h);
                    }
                }
            }
            n=n-1;
        }
        p+=1;
        q+=1;
    }
    if(g1.size()==0)
        cout<<-1;
    else
        cout<<g1.size();
}