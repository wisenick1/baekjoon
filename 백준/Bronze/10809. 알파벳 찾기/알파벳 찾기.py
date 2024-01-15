alphabet = "abcdefghijklmnopqrstuvwxyz"
word = input()

for char in alphabet:
    if char in word:
        print(word.index(char), end=" ")
    else:
        print("-1", end=" ")
