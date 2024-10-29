str = input()

for i in str:
    if i.isupper():
        i = i.lower()
        print(i, end="")
    else:
        i = i.upper()
        print(i, end="")