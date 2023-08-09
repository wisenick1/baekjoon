N = int(input())
array = []
for _ in range(N):
    array.append(input())

for i in array:
    print(i[0], end = "")
    print(i[len(i)-1])