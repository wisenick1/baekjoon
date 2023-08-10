import sys
input = sys.stdin.readline
N, C = map(int, input().split())
house = []
for _ in range(N):
    house.append(int(input()))

house.sort()

result = 0
start = 1
end = house[N-1] - house[0]

while start <= end:
    mid = (start + end) // 2
    x = house[0]
    wifi = 1
    
    for i in range(1, len(house)):
        if house[i] - x >= mid:
            wifi += 1
            x = house[i]
    if wifi >= C:
        result = mid
        start = mid + 1
    else:
        end = mid - 1
        
print(result)