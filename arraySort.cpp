// C++ program for the above approach
#include <bits/stdc++.h>
using namespace std;
void AwesomeSort(vector<int> m, int n)
{

	vector<int> v1, v2, v3;
	int i;
	for (i = 0; i < n; i++) 
    {
		if (m[i] % 10 == 0)
			v1.push_back(m[i]);
		else if (m[i] % 2 == 0)
			v2.push_back(m[i]);
		else
			v3.push_back(m[i]);
	}
	sort(v1.begin(), v1.end(), greater<int>());
	for (int i = 0; i < v1.size(); i++) 
    {
		cout << v1[i] << " ";
	}
	for (int i = v2.size()-1; i >= 0; i--) {
		cout << v2[i] << " ";
	}
	for (int i = 0; i < v3.size(); i++) {
		cout << v3[i] << " ";
	}
}
int main()
{
    int n,val;
    cin>>n;
	vector<int> arr;
    for(int i=0;i<n;i++)
    {
        cin>>val;
        arr.push_back(val);
    }
	AwesomeSort(arr, n);
	return 0;
}
