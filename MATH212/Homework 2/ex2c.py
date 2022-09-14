'''
Rhiana
MATH212 Linear Algebra
Homework 2
'''

import numpy as np;

def coalVals():
  x1 = np.array([27.6, 3100, 250])
  x2 = np.array([30.2, 6400, 360])
  b = np.array([162, 23610, 1623])
  matrix = np.c_[x1, x2]
  ans = np.linalg.solve(matrix, b)

  print(matrix)
  
coalVals()