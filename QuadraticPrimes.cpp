#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool isPrime(int x)
{
  
  if (x <= 1)
    return false;
 
 
  for (int factor = 2; factor*factor <= x; factor++)
    if (x % factor == 0)
      return false;
 
  return true;
}

int main() {
    int limit;
    unsigned int consecutive = 0;
    cin>>limit;
    
    if (limit < 0)
    limit = -limit;
    
    int bestA = 0;
    int bestB = 0;
 
    for (int a = -limit; a <= +limit; a++)
    for (int b = -limit; b <= +limit; b++)
    {
      unsigned int length = 0;
      while (isPrime(length * length + a * length + b))
        length++;
 
      if (consecutive < length)
      {
        consecutive = length;
        bestA = a;
        bestB = b;
      }
    }
    
    cout << bestA << " " << bestB << std::endl;
    return 0;
}

