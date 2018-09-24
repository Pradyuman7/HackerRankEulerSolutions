import sys

t = int(input().strip())
sum = 0
for a0 in range(t):
    n = int(input().strip())
    sum += n
sum_string = str(sum)
print(sum_string[:10])
