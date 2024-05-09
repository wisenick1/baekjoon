import sys
input = sys.stdin.readline

n, m = map(int, input().split())
result = 0
visited = [0] * n
graph = [[0 for _ in range(n)] for _ in range(n)]

for _ in range(m):
    u, v = map(int, input().split())
    graph[u-1][v-1] = graph[v-1][u-1] = 1
    
def dfs(v):
    visited[v] = 1
    for i in range(n):
        if graph[v][i] == 1 and visited[i] == 0:
            dfs(i)

for i in range(n):
    if visited[i] == 0:
        dfs(i)
        result += 1

final_result = result - 1
print(final_result)