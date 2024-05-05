import sys
input = sys.stdin.readline

a, b = map(int, input().split())
list = []

for i in range(1,a+1):
    if a % i == 0 and b % i == 0:
        list.append(i)
        i += 1
    else:
        i += 1

lcm = max(list)        
gcd = a * b // lcm

print(lcm)
print(gcd)