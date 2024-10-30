def solution(a, b):
    answer = 0
    str1 = str(a) + str(b)
    answer = max(int(str1), 2*a*b)
    return answer