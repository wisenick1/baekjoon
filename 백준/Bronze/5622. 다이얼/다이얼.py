dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']

alpha = list(input())
time = 0

for i in alpha:
    for j in dial:
        if i in str(j):	
            num = dial.index(j) + 3	
            time += num
print(time)