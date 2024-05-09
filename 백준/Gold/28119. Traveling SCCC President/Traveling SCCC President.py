v, e, s = map(int, input().split())
parent = [0] * (v + 1)
rank = [0] * (v + 1)
edges = []
result = 0

def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]
    
def merge(a, b):
    a = find(a)
    b = find(b)
    if a != b:
        if rank[a] < rank[b]:
            a, b = b, a
        parent[b] = a
        if rank[a] == rank[b]:
            rank[a] += 1

for i in range(1, v+1):
    parent[i] = i
    
for _ in range(e):
    a, b, cost = map(int, input().split())
    edges.append((cost, a, b))

edges.sort()
    
for edge in edges:
    cost, a, b = edge
    if find(a) != find(b):
        merge(a, b)
        result += cost
        
print(result)
