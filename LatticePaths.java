#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int t, n, m;
    int mod = pow(10,9) +7;
    cin >> t;
    for (int q = 0; q < t; ++q) {
        cin >> n >> m;
        n++;
        m++;
        
        int dp[n][m];
        for (int i = 0; i < n; ++i) {
            dp[i][0] = 1;
        }
        
        for (int i = 0; i < m; ++i) {
            dp[0][i] = 1;
        }
        
        for (int i = 1; i < n; ++i) {
            for (int j = 1; j < m; ++j) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod; // going O(n)+o(n^2)
            }        
        }
        
        cout << dp[n - 1][m - 1] << "\n";
    }
    return 0;
}

