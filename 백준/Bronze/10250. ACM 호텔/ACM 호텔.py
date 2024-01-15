N = int(input())
for _ in range(N):
    a, b, c = map(int, input().split())
    x = c % a
    y = c // a + 1
    
    if x == 0:
        x = a
        y = c // a
    
    result = 100*x + y
    
    print(result)
    
