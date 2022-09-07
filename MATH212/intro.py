# 07th September 2022
#  class discussion

import numpy as np

a = np.array([3,4,5])
# print(3*a)

# creating a matrix
a = np.array([[1,4,5], [1,1,1], [0,1,0]])
# shape gets the size of the matrix
# print(a, a.shape)


# create an inconsistent matrix of 1s and 0s
b = np.eye(10)
# print(b)

#  get a matix of zeros of a given size
c = np.zeros((3, 4))
# print(c)
# get a matrix of ones of a given size
d = np.ones((3, 4))
# print(d)

# get a matrix of the same value in a given size
e = np.full((3, 4), 8)
# print(e)

# random values in a given range, with a given size
f = np.random.randint(3, 8, size=(4, 4))
# print(f)
# # getting a row out of the matrix
# print("Row : ")
# print(f[0])
# # getting a column from the matrix
# print("Column : ")
# print(f[:, 1])
# print("Reshaped column : ")
# print(f[:, 1].reshape(4, 1))




# EXAMPLE 1
A = np.array([[1,-2,1], [0,1,-4], [0,0,1]])
b = np.array([0,4,-1])
# ans = np.linalg.solve(A, b)
aug_A = np.c_[A, b]
# swapping rows
A[[0, 1]] = A[[1, 0]]
# changing data type
A = np.array([], dtype="float")
print(A)