import sys
input = sys.stdin.readline

arr = []
cnt = 0

n = int(input())
arr = list(map(int,input().split()))
t, p = map(int, input().split())

for i in range(len(arr)):
    cnt += (arr[i]-1)//t + 1
    
print(cnt)
print(n//p, n%p)