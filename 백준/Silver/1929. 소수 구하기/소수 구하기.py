import sys
import math

input = sys.stdin.readline

def is_prime_number(x):
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True

a, b = map(int, input().split())

result = []
cnt = 0

if a == 1:
    for i in range(a+1, b+1):
        if is_prime_number(i) == True:
            result.append(i)

else:        
    for i in range(a, b+1):
        if is_prime_number(i) == True:
            result.append(i)

for i in result:
    print(i)