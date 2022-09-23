#include<iostream>
#include<vector>
#include<map>
using namespace std;
long MaxSubarraySum(vector<int> nums, int k)
{
    unordered_set<int> map;
    int left = 0, res = -1, sum = 0;
    for(int right = 0; right<nums.size(); right++)
    {
        while(left < right && (map.count(nums[right]) || map.size() >= k))
        {
            sum -= nums[left];
            map.erase(nums[left]);
            left++;
        }
        sum +=nums[right];
        map.insert(nums[right]);
            
        if (map.size() == k)
            res = max(res, sum);
    }
    return res;
}
int main()
{
    int n;
    cin>>n;
    vector<int> v;
    for(int i=0;i<n;i++)
    {
        int ele;
        cin>>ele;
        v.push_back(ele);
    }
    int k;
    cin>>k;
    long ans=MaxSubarraySum(v,k);
    cout<<ans;
}