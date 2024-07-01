import sys
input = sys.stdin.readline

n = int(input())

stack = []
result = []
canStack = True
start = 1

for i in range(n):
    num = int(input())
    while start <= num:
        stack.append(start)
        result.append("+")
        start += 1
    if stack[-1] == num:
        stack.pop()
        result.append("-")
    else:
        canStack = False

if not canStack:
    print("NO")
else:
    for i in result:
        print(i)