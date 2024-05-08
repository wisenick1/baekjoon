n = int(input())
arr = list(map(int, input().split()))

def yes_or_no(list):
    
    for i in range(1, n):
        diff = list[1] - list[0]
        if list[i] - list[i-1] != diff:
            return False
    return True  
        
if yes_or_no(arr) == True:
    print("YES")
    print(*arr)
    print('0 ' * n)
else:
    print("NO")