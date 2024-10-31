def solution(n):
    answer = 0
    if n % 2 == 1:
        for i in range(n//2+1):
            answer += 2*i+1
    else:
        for i in range(n//2):
            answer += (2*(i+1))**2
            
    return answer