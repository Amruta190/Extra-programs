// C++ program to find out all combinations of
// positive numbers that add upto given number
#include <iostream>
#include<vector>
using namespace std;

/* arr - array to store the combination
	index - next location in array
	num - given number
	reducedNum - reduced number */
void findCombinationsUtil(int arr[], int index,
					int num, int reducedNum,int x)
{
    int cnt=0;
	// Base condition
	if (reducedNum < 0)
		return;

	// If combination is found, print it
	if (reducedNum == 0)
	{
        int ans=0;
		for (int i = 0; i < index; i++)
			// cout << arr[i] << " ";
            ans=ans|arr[i];
		// cout << endl;
        if(ans==x)
            cnt+=1;
		return;
	}

	// Find the previous number stored in arr[]
	// It helps in maintaining increasing order
	int prev = (index == 0)? 1 : arr[index-1];

	// note loop starts from previous number
	// i.e. at array location index - 1
	for (int k = prev; k <= num ; k++)
	{
		// next element of array is k
		arr[index] = k;

		// call recursively with reduced number
		findCombinationsUtil(arr, index + 1, num,
								reducedNum - k,x);
	}
    cout<<cnt;
}

/* Function to find out all combinations of
positive numbers that add upto given number.
It uses findCombinationsUtil() */
void findCombinations(int n,int x)
{
	// array to store the combinations
	// It can contain max n elements
	int arr[n];

	//find all combinations
	findCombinationsUtil(arr, 0, n, n,x);
}

// Driver code
int main()
{
    long int n,m,x;
    cin>>n>>m>>x;
    vector<long int>g1;
    if(m<x)
    {
        cout<<0;
    }
    else
    {
        findCombinations(m,x);
	    return 0;   
    }
}