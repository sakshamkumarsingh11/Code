import math

mu = 75
sigma = 25
n = 110
x_bar = 82
stderr= sigma / math.sqrt(n)
# Z-score
z = (x_bar - mu) / stderr
print("Z-score:", z)
