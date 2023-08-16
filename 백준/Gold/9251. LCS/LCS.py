import sys
imput = sys.stdin.readline
A = input().rstrip()
B = input().rstrip()

N = len(A) + 1
M = len(B) + 1

array = [[0]*(M) for _ in range(N)]

for i in range(1, N):
    for j in range(1, M):
        if A[i-1] == B[j-1]:
            array[i][j] = array[i-1][j-1]+1
        else:
            array[i][j] = max(array[i-1][j], array[i][j-1])
            
print(array[N-1][M-1])