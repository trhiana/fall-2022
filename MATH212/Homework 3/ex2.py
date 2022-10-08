"""
trhiana
Homework 3
Exercise 2
"""

from sympy import *
import matplotlib


def main():
    A = Matrix([[1, 3, -5, 0], [1, 4, -8, 0], [-3, -7, 9, 0]])
    print(A.rref())
main()
