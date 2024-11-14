T = int(input())
for test_case in range(1, T+1):
    n = int(input())
    a = 0
    result = []
    while True:
        a = n % 2
        result.append(a)
        n //= 2
        if n == 0:
            break
    
    min_index = 0
    for i in range(len(result)):
        if result[i] == 1:
            min_index = i
            print(min_index, end = " ")