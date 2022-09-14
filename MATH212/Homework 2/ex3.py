"""
Rhiana
MATH212 Linear Algebra
Homework 2
Exercise 3
"""

import sympy

def matrixSolution():
    matrix = sympy.Matrix([[8,11,-6,-7,13], [-7,-8,5,6,-9], [11,7,-7,-9,-6], [-3,4,1,8,7]])
    ans = matrix.rref()
    print(ans)
matrixSolution()