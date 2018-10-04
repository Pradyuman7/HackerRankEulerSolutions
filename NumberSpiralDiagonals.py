if __name__ == '__main__':
    tc = int(input().strip())
    mod = 1000000007
    for _ in range(tc):
        n = int(input().strip())
        print((1+(5*((n**2)-1)//2)+(2*(n*(n-1)*(n-2))//3))%mod)
