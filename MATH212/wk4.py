"""
14/09/2022
Using sympy lib
"""

from sympy import *

A = Matrix([[3,5,-4], [-3,-2,4], [6,1,-8]])
b = Matrix([7,-1,-4])
aug_A = A.col_insert(3, b)
ans = aug_A.rref()
print(ans)
