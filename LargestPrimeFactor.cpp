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

long largestPrime(long long n){
    long ans,lar=n;
    while (n && n % 2 == 0) {
        lar = 2;
        n /= 2;
    }
    int fact = 3;
    float sqroot = sqrt(n);
    while (fact <= sqroot) {
        if (n % fact == 0) {
            lar = fact;
            do { 
                n /= fact; 
            } while (n % fact == 0);
            sqroot = sqrt(n);
        }
        fact += 2;
    }
    if (lar < n)
        lar = n;
    return lar;
}

int main(){
    long t,k;
    long ans;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        long n;
        cin >> n;
        ans = largestPrime(n);
        cout<<ans<<endl;  
    }
    return 0;
}
