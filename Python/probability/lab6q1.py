import math

def nCr(n, r):
    return math.comb(n, r)

n = 20
p = 0.1
q = 1 - p
a = nCr(n, 3) * (p**3) * (q**(n-3)) # exactly 3 
b = sum(nCr(n, k) * (p**k) * (q**(n-k)) for k in range(0, 3)) # exactly  2
c = 1 - (q**n) # exactly 1

print("a) Exactly 3 defective:", a)
print("b) At most 2 defective:", b)
print("c) At least 1 defective:", c)
