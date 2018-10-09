#include<bits/stdc++.h>
using namespace std;
#define MAX 1000000
int SPF[MAX];
void sieve()
{
    for(int i = 1;i < MAX;i++)
        SPF[i] = i;
    for(int i = 4; i < MAX;i = i + 2)
        SPF[i] = 2;
    for(int i = 3; i * i < MAX;i = i + 1)
    {
        if(SPF[i] == i)
        {
            for(int j = i * i; j < MAX;j = j + i)
            {
                if(SPF[j] == j)
                    SPF[j] = i;
            }
        }
    }
}
unsigned long long int factorSum(int x)
{
    unordered_map<int,int> umap;
    int n = x;
    while(x != 1)
    {
        umap[SPF[x]]++;
        x = x / SPF[x];
    }
    unordered_map<int,int> :: iterator it;
    unsigned long long int ans = 1;
    for(it = umap.begin(); it != umap.end(); it++)
    {
        ans = ans * (pow(it->first,it->second + 1) - 1) / (it->first - 1);
    }
    return (ans - n);
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    sieve();
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int flag = 0;
        for(int i = 1;i <= n/2; i = i+1)
        {
            if( (factorSum(i) > i) )
            {
                if(factorSum(n-i) > (n-i))
                {
                    flag = 1;
                    break;
                }
                else
                {
                    flag = 0;
                    continue;
                }
            }
        }
        if(flag)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    return 0;
}
