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


int main(){
    int t;
    cin >> t;
    for(long a0 = 0; a0 < t; a0++){
        long N;
        cin >> N;
        long int a=(N-1)/3;
        long int b=(N-1)/5;
        long int c=(N-1)/15;
        long int sum=(3*a*(a+1)/2)+(5*b*(b+1)/2)-(15*c*(c+1)/2);
        cout<<sum<<endl;
    }
    return 0;
}
