import heapq
import sys
input = sys.stdin.readline
INF = int(1e9)


n = int(input())
m = int(input())
graph = [[] for i in range(n+1)]
distance = [INF] * (n+1)
pre_node = [0] * (n+1)
path = []

for _ in range(m):
    a, b, c = map(int,input().split())
    graph[a].append((b,c))
x, y = map(int, input().split())

def dijkstra(start):
    q = []
    heapq.heappush(q,(0,start))
    distance[start] = 0
    while q: 
        dist , now = heapq.heappop(q)
        if distance[now] < dist:
            continue
        for i in graph[now]:
            cost = dist + i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                pre_node[i[0]] = now
                heapq.heappush(q,(cost,i[0]))

    return distance

result = dijkstra(x)

print(result[y])

while y:
    path.append(y)
    y = pre_node[y]
print(len(path))
print(*path[::-1])