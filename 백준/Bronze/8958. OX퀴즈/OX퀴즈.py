N = int(input())
for _ in range(N):
    quiz_list = list(input())
    score = 0
    sum_score = 0
    for quiz in quiz_list:
        if quiz == "O":
            score += 1
            sum_score += score
        else:
            score = 0
    print(sum_score)