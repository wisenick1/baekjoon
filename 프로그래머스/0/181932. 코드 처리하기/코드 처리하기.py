def solution(code):
    cnt = 0
    mode = 0
    ret =''
    for i in range(len(code)):
        if code[i] == "1":
            cnt += 1
            if cnt % 2 == 1:
                mode = 1
            else:
                mode = 0
        if mode == 0 and i % 2 == 0 and code[i] != "1":
            ret += code[i]
        elif mode == 1 and i % 2 == 1 and code[i] != "1":
            ret += code[i]
            
            
    if ret == '':
        return "EMPTY"
                
    return ret