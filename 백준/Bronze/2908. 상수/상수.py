a, b = map(int, input().split())

a2 = int(str(a)[::-1])
b2 = int(str(b)[::-1])

if(a2 >= b2):
    print(a2)
else:
    print(b2)