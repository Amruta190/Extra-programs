import itertools
import statistics
def meanMedian(input1,input2):
    s = []
    s = input2
    lst = []
    final = []
    op = []
    max_val = 0
    diff  = 0
    for i in range(1,input1+1):
        n=i
        lst = list(itertools.combinations(s,n))
        final = final +lst      
    for i in range(len(final)):
        men = statistics.mean(final[i])
        med = statistics.median(final[i])
        diff = men - med
        if max_val < diff:
            op = final[i]
            max_val = diff
    return op
n=int(input())
res = list(map(int, input().strip().split()))[:n]
print(meanMedian(n,(list(res))))