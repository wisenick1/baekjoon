n = int(input())

for i in range(n):
    stack = []
    vps = input()
    for j in vps:
        if j == '(':
            stack.append(j)
        else:
            if stack:
                stack.pop()
            else:
                print("NO")
                break
    else:
        if not stack:
            print("YES")
        else:
            print("NO")
    