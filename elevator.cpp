#include<iostream>
using namespace std;
int main()
{
    char tmp;
    int arr[100],size=0;
    while(true)
    {
        cin>>arr[size++];
        cin>>tmp;
        if(tmp=='\n')
            break;
    }
    // for(int i=0;i<size;i++)
        // cout<<arr[i]<<" ";
        cout<<size;
}