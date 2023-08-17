import sys
input = sys.stdin.readline
n = int(input())

array = []
for _ in range(n):
    array.append(list(map(int, input().split())))

d = [[0]*n for _ in range(n)]

for i in range(n-1):
    for j in range(n-1-i):
        k = i+j+1
        d[j][k] = 2**31
        for l in range(j, k):
            d[j][k] = min(d[j][k], d[j][l]+d[l+1][k] + array[j][0]*array[l][1]*array[k][1])

print(d[0][n-1])