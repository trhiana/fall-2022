"""
Rhiana
MATH212 Linear Algebra
Homework 2
Exercise 2 c.
"""

from sympy import *

def coalVals():
    x1 = Matrix([27.6, 3100, 250])
    x2 = Matrix([30.2, 6400, 360])
    b = Matrix([162, 23610, 1623])
    aug = x1.col_insert(1, x2)
    aug = aug.col_insert(2, b)
    ans = aug.rref()

    print(ans)

coalVals()
