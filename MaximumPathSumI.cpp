#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    
    int t;
    cin >> t;
    
    for (int i = 1; i <= t ; i++){
        int n, val;
        cin >> n;
        
        vector< vector<int> > dp(n);
        
        for (int i = 0 ; i < n; i++){
            for (int j = 0; j <= i; j++){
                cin >> val;
                dp[i].push_back(val);
            }
        }
        
        for (int i = n - 2 ; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                dp[i][j] += max(dp[i + 1][j], dp[i + 1][j + 1]);    
            }
        }
        
        cout << dp[0][0] << endl;    
    }
    
    return 0;
}

