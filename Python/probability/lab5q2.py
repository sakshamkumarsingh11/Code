import numpy as np
x = np.array([0,1,2,3,4,5,6])
f = np.array([4,7,11,14,13,8,3])
N = f.sum()
mean = (x * f).sum() / N
variance = ((x**2 * f).sum() / N) - mean**2
# p_atleast4 = f[x>=4].sum() / N

print("Mean:", mean)
print("Variance:", variance)

