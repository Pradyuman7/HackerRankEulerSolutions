#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int getSumOfDigits(int n) {
    
    int len = (int) (floor(n/log2(10)) + 1);
   
    char *digitStr = new char[len + 1];
    
    if(sprintf(digitStr, "%.0Lf", exp2((long double) n)) < 0) {
        cout << "Error writing to digit string." << endl;
        return -1;
    }
    int sum = 0;
  
    for(int i = 0; i < len; i++) {
        sum += static_cast<int>(digitStr[i] - '0');
    }
    delete[] digitStr;
    return sum;
}

int main() {
    int t,n;
    cin>>t;
    for(int i=0;i<t;i++){
        cin>>n;
        cout<<getSumOfDigits(n)<<endl;
    }
    return 0;
}

