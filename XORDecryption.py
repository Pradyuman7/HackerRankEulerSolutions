N=int(input())
list=[int(i) for i in input().split(" ")]

cw=[32,40,41,58,59,46,39,44,63,45,33,48, 49, 50, 51, 52,    53, 54, 55, 56,57,65, 66, 67, 68, 69, 70, 71, 72, 73, 74,       75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89,     90,97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108,     109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120,     121, 122]


for i in range(97,123):
    for j in range(97,123):
        for k in range(97,123):
            c0=i
            c1=j
            c2=k
            f=1
            for p in range(N):
                if p%3==0:
                    a=list[p]^c0
                if p%3==1:    
                    a=list[p]^c1
                if p%3==2:    
                    a=list[p]^c2

                if a not in cw:
                    f=0
                    break
            if f==1:
                print(chr(i),end="")
                print(chr(j),end="")
                print(chr(k))
