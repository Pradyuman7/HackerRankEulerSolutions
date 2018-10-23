def same_digits(A,B):
    LA = list(str(A))
    LB = list(str(B))
    LA.sort()
    LB.sort()     
    if LA==LB: return(True)
    else: return(False)

N, K = map(int,input().split())
for num in range(125874,N+1):
    label = False
    for iteration in range(2,K+1):
        if same_digits(num,iteration*num):
            if iteration==K:
                result = [num*x for x in range(1,K+1)]
                for i in range(len(result)-1):
                    print(result[i],end = " ")
                print(result[len(result)-1])
                break
        else: break
