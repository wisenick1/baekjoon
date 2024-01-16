A = int(input())
B = int(input())
C = int(input())

multi_list = []
num_list = []

for _ in range(10):
    num_list.append(0)

for i in str(A*B*C):
    multi_list.append(int(i))

for i in range(len(multi_list)):
    for j in range(10):
        if multi_list[i] == j:
            num_list[j] += 1

for i in num_list:
    print(i)