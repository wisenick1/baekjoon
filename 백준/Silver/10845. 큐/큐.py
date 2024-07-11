import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
result = deque()

for i in range(n):
    arg = input().split()
    
    if arg[0] == 'push':
        result.append(arg[1])
        
    elif arg[0] == 'pop':
        if len(result) > 0:
            print(result.popleft())
        else: print(-1)
    
    elif arg[0] == 'size':
        print(len(result))
    
    elif arg[0] == 'empty':
        if len(result) > 0: print(0)
        else: print(1)
        
    elif arg[0] == 'front':
        if len(result) > 0: print(result[0])
        else: print(-1)
    
    elif arg[0] == 'back':
        if len(result) > 0: print(result[len(result)-1])
        else: print(-1)