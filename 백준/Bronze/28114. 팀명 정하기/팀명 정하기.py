import sys
input = sys.stdin.readline

list = []
for _ in range(3):
    list.append(input().split())

list.sort(key = lambda x : x[1])

print(list[0][1][2]+list[0][1][3]+list[1][1][2]+list[1][1][3]+list[2][1][2]+list[2][1][3])

list.sort(key = lambda x : -int(x[0]))

print(list[0][2][0]+list[1][2][0]+list[2][2][0])