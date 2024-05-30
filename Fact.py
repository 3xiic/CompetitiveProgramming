from math import factorial
import sys

for line in sys.stdin:
    num = int(line)
    print(num, end="!\n")
    print(factorial(num))