import sys
input = sys.stdin.readline

n = int(input())

list = []

for _ in range(n):
    list.append(int(input().strip()))

list.sort()

for i in list:
    print(i)