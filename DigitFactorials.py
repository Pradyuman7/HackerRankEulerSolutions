import math
def fact(n):
    f=math.factorial(n)
    return f
def fact_sum(n):
    sum= 0
    while(n>0):
        sum+=fact(n%10)
        n=n//10
    return sum    
    
a=int(input())
ans=0
for i in range(10,a):
    if((fact_sum(i))%i==0):
        ans+=i
print(ans)
