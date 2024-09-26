import sys
sys.set_int_max_str_digits(10**6)
testcases = [[int(i) for i in input().split()] for i in range(0, int(input()))]
def solve(n, k):
    n = list(map(int, str(n)))
    for _ in range(k):
        n = [i*3 for i in n]
        n = list(map(int, str(int(''.join(map(str, n))))))
        n = str(int(''.join(map(str, n))) % 123456789)

for i in testcases:
    print(str(solve(*i)) + "\n")
