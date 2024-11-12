from collections import deque

n, m, v = map(int, input().split())
edges = [list(map(int, input().split())) for _ in range(m)]
visited1 = [False] * (n+1)
visited2 = [False] * (n+1)

graph = [[] for _ in range(n+1)]
for edge in edges:
    a, b = edge
    graph[a].append(b)
    graph[b].append(a)
    
for neighbors in graph:
    neighbors.sort()


def dfs(graph, v, visited):
    visited[v] = True
    print(v, end = " ")
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited) 
            
def bfs(graph, v, visited):
    visited[v] = True
    queue = deque([v])
    while queue:
        s = queue.popleft()
        print(s, end = " ")
        for i in graph[s]:
            if not visited[i]:
                visited[i] = True
                queue.append(i)
                
dfs(graph, v, visited1)
print()
bfs(graph, v, visited2)