import sys
input = sys.stdin.readline

INF = int(1e9) 

n = int(input())
m = int(input())

graph = [[INF] * (n + 1) for _ in range(n + 1)]
path = [[[i] for i in range(n+1)] for i in range(n+1)]

for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a][b] = min(graph[a][b], c)

for k in range(1, n + 1):
    for a in range(1, n + 1):
        for b in range(1, n + 1):
            if a == b:
                continue
            if graph[a][b] > graph[a][k] + graph[k][b]:
                graph[a][b] = graph[a][k] + graph[k][b]
                path[a][b] = path[a][k] + path[k][b]

for a in range(1, n + 1):
    for b in range(1, n + 1):
        if graph[a][b] == 1e9:
            print(0 , end=" ")
        else:
            print(graph[a][b], end=" ")
    print()

for a in range(1, n + 1):
    for b in range(1, n + 1):
        if graph[a][b] == INF:
            print(0)
        else:
            print(len(path[a][b])+1, a, *path[a][b])