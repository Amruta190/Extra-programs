#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int factorial(int p)
{
    if(p==1)
        return 1;
    else
        return p*factorial(p-1);
}
void print(vector<vector<int> > output,int x,int n,int m){
    vector<int> g1,g2;
    int ans=0,v=0;
  for(int i = 0; i < output.size(); i++){
    g1.clear();
    for(int j = 0; j < output[i].size(); j++){
        ans=ans|output[i][j];
        g1.push_back(output[i][j]);
    }
    if(ans==x)
    {
        if(g1.size()!=n)
        {
            int l=g1.size();
            for(int k=0;k<abs(l-n);k++)
                g1.push_back(0);
        }
        for(int z=0;z<n;z++)
        {
            int t=count(g1.begin(),g1.end(),z);
            g2.push_back(factorial(t));
        }
        int fact=1;
        vector<int>::iterator y;
        for(y=g2.begin();y!=g2.end();y++)
        {
            fact=fact*(*y);
        }
        v=v+(factorial(n)/fact);
    }
  }
  if(m==x)
    cout<<n+v;
    else
        cout<<v;
}
void print_all_sum_rec(
    int target,
    int current_sum,
    int start, vector<vector<int> >& output,
    vector<int>& result) {

  if (target == current_sum) {
    output.push_back(result);
  }

  for (int i = start; i < target; ++i) {
    int temp_sum = current_sum + i;
    if (temp_sum <= target) {
      result.push_back(i);
      print_all_sum_rec(target, temp_sum, i, output, result);
      result.pop_back();

    } else {
      return;
    }
  }
}
vector<vector<int> > print_all_sum(int target) {
  vector<vector<int> > output;
  vector<int> result;
  print_all_sum_rec(target, 0, 1, output, result);
  return output;
}
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
        vector<vector<int> > result = print_all_sum(m);
        print(result,x,n,m);
    }
}