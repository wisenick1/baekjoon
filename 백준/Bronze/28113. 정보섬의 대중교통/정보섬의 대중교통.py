import sys
input = sys.stdin.readline

n, a, b = map(int, input().split())

if n <= b and b < a:
    print("Subway")
    
if n <= a and a==b:
    print("Anything")

if a < b:
    print("Bus")
elif b<=a and b < n:
    print("Bus")