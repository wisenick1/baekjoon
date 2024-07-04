import sys
input = sys.stdin.readline

n, m = map(int, input().split())
card = list(map(int, input().split()))

result = 0
sub = 0

for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            sub = card[i] + card[j] + card[k]
            if sub <= m and sub > result:
                result = sub
                
print(result)