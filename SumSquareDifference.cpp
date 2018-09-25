#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;

long totalSquare(long n){
    long sum=0;
    for(long i=1;i<=n;i++)
        sum+=i;
    
    return sum*sum;
}

long allSquare(long n){
    long sum=0;
    for(long i=1;i<=n;i++)
        sum+=i*i;
    
    return sum;
}

int main(){
    int t;
    cin >> t;

    for(int i = 0; i < t; i++){
        long n,k,m;
        cin >> n;
        k = totalSquare(n);
        m = allSquare(n);
        cout<<k-m<<endl;
    }
    
    return 0;
}
