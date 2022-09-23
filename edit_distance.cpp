#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int min(int a,int b,int c)
{
    return (a<b && a<c)?a:((b<c)?b:c);
}
int ed(string st,string str,int m, int n)
{
    if(m==0)
        return n;
    if(n==0)
        return m;
    if(st[m-1]==str[n-1])
        return ed(st,str,m-1,n-1);
    else
        return 1+min(ed(st,str,m,n-1),ed(st,str,m-1,n),ed(st,str,m-1,n-1));
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        string st,str;
        cin>>st>>str;
        cout<<ed(st,str,st.length(),str.length())<<"\n";
    }
    return 0;
}
