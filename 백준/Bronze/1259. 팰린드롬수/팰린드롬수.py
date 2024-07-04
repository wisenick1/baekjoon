import sys
input = sys.stdin.readline

while True:
    n = input().strip()
    if n == "0":
        break
    s = n
    palindrome = True
    
    for i in range(len(s) // 2):
        if s[i] != s[-(i + 1)]:
            palindrome = False
            break
    
    if palindrome:
        print("yes")
    else:
        print("no")
