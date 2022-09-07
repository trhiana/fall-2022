# 07th September 2022
#  Rhiana Latifah Nakalemba
# Excercise 1

import numpy as np

# # Number 1
# vitamins = np.array([[1,9,2,1,1], [10,1,2,1,1], [1,0,5,1,1], [2,1,1,2,9], [2,1,2,13,2]])
# total = [170, 180, 140, 180, 350]
# ans = np.linalg.solve(vitamins, total)
# print(ans)

# # Number 2
# mine_output = [[20, 550], [30, 500]]
# total = [150, 2825]
# ans = np.linalg.solve(mine_output, total)
# print(ans)

# Number 3
A = np.array([[0,-3,-6,4,9], [-1,-2,-1,3,1], [-2,-3,0,3,-1], [1,4,5,-9,-7]], dtype='float')
A[[0, 3]] = A[[3, 0]] # interchange row 1 and row 4
A[[1]] = A[[0]] + A[[1]] # add row 1 and row 2
A[[2]] = 2.0*A[[0]] + A[[2]] # add 2*row 1 to row 3
A[[1]] = A[[1]] / 2.0 # divide row 2 by 2
A[[2]] = -5.0*A[[1]] + A[[2]] # add -5*row 2 to row 3
A[[2, 3]] = A[[3, 2]] # interchange row 3 and row 4
A[[2]] = 3.0*A[[1]] + A[[2]] # add 3*row 2 to row 3
A[[0]] = A[[0]] + -4.0*A[[1]] # add row 1 to -4*row 2 
print(A)