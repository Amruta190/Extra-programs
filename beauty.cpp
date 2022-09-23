#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
    int N;
    cin>>N;
    int A[N];
    for(int i=0;i<N;i++)
        cin>>A[i];
    int size = sizeof(a)/sizeof(a[0]);
    int B[N];
    for(int i=0;i<N;i++)
        B[i]=A[i];
    int min=math.INT_MAX;
    std::sort(B, B+size);
    do {
        int sum=0;
        for(int i=1;i<N;i++)
        {
            sum+=abs(B[i-1]-B[i]);
        }
        if(min>sum)
            min=sum;
    } while(std::next_permutation(B, B+size));
    cout<<min;
}