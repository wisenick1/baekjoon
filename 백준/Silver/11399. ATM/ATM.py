n = int(input())

p = list(map(int, input().split()))
p.sort()
arr = []

for i in range(n):
    for j in range(i+1):
        arr.append(p[j])
        
print(sum(arr))

