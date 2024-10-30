def solution(my_string, overwrite_string, s):
    answer = ''
    for i in range(s):
        answer += my_string[i]
    for j in overwrite_string:
        answer += j
    for k in range(s+len(overwrite_string), len(my_string)):
        answer += my_string[k]
        
    return answer