import math

def nCr(n, r):
    return math.comb(n, r)

p = 0.3
q = 1 - p
r = 4 
# 5f 4w
a = nCr(5 + r - 1, r - 1) * (p**r) * (q**5)

#  4w 9tb 
b= nCr(9, 4) * (p**4) * (q**5)

c = nCr(8, 3) * (p**3) * (q**5) * p

print("a) 5 failures before 4 wins:", a)
print("b) Exactly 4 wins in 9 trials:", b)
print("c) 4th win on 9th trial:", c)
