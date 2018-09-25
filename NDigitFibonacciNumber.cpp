#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
 
 
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int64_t n,tmp;
    vector<int> no;
    long double Phi=(1+sqrt(5))/2;
    long double phi=(sqrt(5)-1)/2;
    cin>>n;
    for(int i=0;i<n;i++)
        {
        cin>>tmp;
        no.push_back(tmp);
    }
 
    for(int j=0;j<n;j++)
        {
        if(no[j]>1)
            cout<<ceil(-1*(((no[j]-1)*log10(10))+(log10(5)/2.0))/(log10(phi)))<<endl;
        else if(no[j]==1)
            cout<<1<<endl;
        else
            cout<<0<<endl;
        }
 
    return 0;
}

