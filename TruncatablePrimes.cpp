//
//  main.cpp
//  random
//
//  Created by Pradyuman Dixit on 22/07/18.
//  Copyright © 2018 Pradyuman Dixit. All rights reserved.
//

#include <iostream>
#include <math.h>
using namespace std;


bool isPrime(int x) {

  if(x <= 1) return false;
  if(x == 2 || x == 3) return true;
  else if (x % 2 == 0) return false;

  else {

      for (int i = 3; i < (int)sqrt((float)x)+1; i++) {

          if (x % i == 0) return false;
      }
  }

  return true;
}

bool truncatableCheck(int x) {
    if (x<=0) return false;

    int len = 0;
    int tmp = x;
    while (tmp !=0)
    {
        len ++;
        tmp /= 10;
    }

    tmp = x;
    while (tmp != 0) {

        if (isPrime(tmp) != true) {

            return false;
        }

        tmp /= 10;
    }

    tmp = x;
    while(len > 1 ) {

        int y = tmp % (int)pow((float)10, len-1);

        if (isPrime(y) != true) {
            return false;
        }

        len--;
    }

    return true;
}

int main() {

      int n;
      int sum = 0;
    
    cin>>n;

    for(int i =8;i<=n;i++){
          if (truncatableCheck(i))
              sum += i;
      }
      cout<<sum<< endl;
      return 0;
}

