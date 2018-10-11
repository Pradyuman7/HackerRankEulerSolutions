#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() 
{
    double n;
    long int a,x;
    cin>>n;
    while(n--)
    {
        cin>>x;
        a=sqrt(2*x);
       
        if((a*(a+1))==(x*2))
            cout<<a<<endl;
        
        else
            cout<<-1<<endl;
        
    }
    return 0;
}
