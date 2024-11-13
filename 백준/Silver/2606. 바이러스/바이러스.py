n = int(input())
m = int(input())

graph = [[0]*(n+1) for _ in range(n+1)]

for i in range(m):
    a, b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1

visited = [False] * (n+1)
cnt = 0

def dfs(v):
    visited[v] = True
    for i in range(1,n+1):
        if visited[i] == False and graph[v][i] == 1:
            visited[i] == True
            dfs(i)
            
dfs(1)

cnt = 0

for i in visited:
    if i == True:
        cnt += 1

print(cnt-1)

