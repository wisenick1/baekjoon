import sys
input = sys.stdin.readline

n = int(input())

list = [0]*10001

for _ in range(n):
    list_num = int(input())
    list[list_num] += 1

for i in range(10001):
    if list[i] != 0:
        for j in range(list[i]):
            print(i)
