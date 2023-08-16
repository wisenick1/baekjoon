import sys
input = sys.stdin.readline

array = list(map(int, input().split()))

A = sorted(array)
B = sorted(array, reverse = True)

if array == A:
    print("ascending")
elif array == B:
    print("descending")
else:
    print("mixed")

