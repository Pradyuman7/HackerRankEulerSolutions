#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int sum(int n,int p){
    int m=n,sum=0;
    while(m>0){
        int x=m%10;
        sum=sum+pow(x,p);
        m=m/10;
    }
    return sum;
}

int main() {
    int n;
    cin>>n;
    long long GrandSum=0;
         for(int i=10;i<1000000;i++){
                if(i==sum(i,n)){
                    GrandSum=GrandSum+i;
                }
         }
    cout<<GrandSum;
    return 0;
}
