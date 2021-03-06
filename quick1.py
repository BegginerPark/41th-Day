def Quick_sort(a):
    n = len(a)
    if n <= 1: # 리스트가 1개이면 정렬하지 않는다.
        return a
    pivot = a[-1] # 리스트의 마지막을 피벗으라고 구함
    g_left = [] # 피벗 수보다 작은 수를 담을 리스트
    g_right = [] # 피벗 수보다 큰 수를 담을 리스트
    for i in range(0, n-1):
        if a[i] <= pivot:
            g_left.append(a[i]) # 리스트의 수가 비벗 보다 작으면 g_left에 추가
        else:
            g_right.append(a[i])
    return Quick_sort(g_left) + [pivot] + Quick_sort(g_right) # 새로운 리스트를 만듬
    #       8,12,1,9,25                     102,32,98,31

d = [8,12,1,9,102,25,32,98,31]
print(Quick_sort(d))