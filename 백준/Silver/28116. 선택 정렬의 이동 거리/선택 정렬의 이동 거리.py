import sys
input = sys.stdin.readline
n = int(input())
original_positions = list(map(int, input().split()))
current_positions = [0] * n
result = [0] * n

for i in range(n):
    original_positions[i] -= 1
    current_positions[original_positions[i]] = i

for i in range(n):
    j = current_positions[i]
    distance = abs(i - j)
    if i != j:
        original_positions[i], original_positions[j] = original_positions[j], original_positions[i]
        current_positions[original_positions[i]] = i
        current_positions[original_positions[j]] = j
        result[original_positions[i]] += distance
        result[original_positions[j]] += distance

print(*result)