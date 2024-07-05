n, k = map(int, input().split())
people = list(range(1, n+1))
result = []

index = 0
while len(people) > 0:
    index = (index + k - 1) % len(people)
    result.append(people.pop(index))

print("<" + ", ".join(map(str, result)) + ">")
