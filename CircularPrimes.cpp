// this is done by precomputing, I'll be adding a new code without usign percomputation soon

include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    long int a[]={2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97, 113, 131, 197, 199, 311, 337, 373, 719, 733, 919, 971, 991, 1193, 1931, 3119, 3779, 7793, 7937, 9311, 9377, 11939, 19391, 19937, 37199, 39119, 71993, 91193, 93719, 93911, 99371, 193939, 199933,
       319993,331999,391939,393919,919393,933199,939193,939391,993319,999331};
    long int n,ans;
    cin>>n;
   
        for(int j=0;j<=54;j++)
        {
            if(a[j]<=n)ans=ans+a[j];
            if(a[j]>n)break;
        }
   cout<<ans;
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
