maxValue = 0
cur = 0

for i in range(10):
    a, b = map(int, input().split())
    cur += (b-a)
    if cur > maxValue:
        maxValue = cur

print(maxValue)