#include<iostream>
using namespace std;

int main(){
    long long product, temp;
    int a, b, c, n, t; 
    cin >> t; 
    for(int i = 0; i < t; i++){
        cin >> n;
        product = -1; 
        for(int a = 1, b, c; a <= n/3; a++){
            b = (n*n - 2*n*a)/(2*n - 2*a);
            c = n - a - b; 
            if(c*c == (a*a + b*b)){
                temp = a*b*c; 
                if(temp > product){
                    product = temp; 
                }
            }
        }
        cout << product << endl;
    }
}
