a=list(map(int,(input().split())))

n1=a[0]
n2=a[1]

car9=[1,2,3,4,5,6,7,8,9]# Comparing Array for 9
car8=[1,2,3,4,5,6,7,8]# Comparing Array for 8


num=[]



for x in range(2,n1):
    finar = []
    for y in range(1,n2+1):
        ct=0
        pr=x*y
        q=str(pr)

        for z in range(len(q)):
            if q[z] in finar:
                ct=1
                break
            else:
                r=int(q[z])
                finar.append(r)
        if ct==1:
            break
        if sorted(finar)==car9 and n2==9:
            num.append(x)
            break
        if sorted(finar)==car8 and n2==8:
            num.append(x)
            break

for r in num:
    print(r)
