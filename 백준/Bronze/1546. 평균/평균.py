n = int(input())
arr = list(map(int, input().split()))

max_value = max(arr)
value = []

for i in arr:
    x = i/max_value*100
    value.append(x)
    
print(sum(value)/n)