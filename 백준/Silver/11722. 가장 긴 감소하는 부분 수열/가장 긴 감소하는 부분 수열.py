N = int(input())
array = list(map(int, input().split()))

d = [1] * N

for i in range(1, N):
    for j in range(i):
        if array[i] < array[j]:
            d[i] = max(d[j] + 1, d[i])

print(max(d))