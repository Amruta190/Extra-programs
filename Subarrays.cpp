#include<iostream>
using namespace std;
int n,k,p;
int arr[100001];
void sort()
{
    int i,j;
    for (i=0;i<n;i++) 
    {
        for (j=0;j<n-i-1;j++)
        {
            if (arr[j] > arr[j+1]) 
            {
                int temp  =  arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
int main()
{
    cin>>n>>k>>p;
    int i,j;
    for(i=0;i<n;i++)
        cin>>arr[i];
    sort();
    for(i=0;i<p;i++)
    {
        for(j=0;j<k;j++)
        {
            arr[j]+=1;
        }
        sort();
    }
    cout<<arr[0];
}