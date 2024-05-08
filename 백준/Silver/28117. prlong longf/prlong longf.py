import sys
input = sys.stdin.readline

n = int(input())
S = input()

fibo = [0]*22
fibo[0] = fibo[1] = 1
for i in range(2, 22):
    fibo[i] = fibo[i-1] + fibo[i-2]

idx = 0
long = 0
result = 1

while idx < n:
    if S[idx:idx+4] == "long" and idx +3 < n:
        long += 1
        idx += 4
    else:
        result *= fibo[long]
        long = 0
        idx += 1
        
print(result * fibo[long])