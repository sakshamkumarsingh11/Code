import math

def nCr(n, r):
    return math.comb(n, r)

n = 5
p = 0.5
q = 0.5
families = 800

#  3 boys
a = nCr(n, 3) * (p**3) * (q**2) * families

# 5 girls
b = nCr(n, 0) * (p**0) * (q**5) * families

# 2 or 3 boys
c = (nCr(n, 2) * (p**2) * (q**3) + nCr(n, 3) * (p**3) * (q**2)) * families

# d) At least 2 girls 
d = sum(nCr(n, k) * (p**k) * (q**(n-k)) for k in range(0, 4)) * families

print("a) Families with 3 boys:", a)
print("b) Families with 5 girls:", b)
print("c) Families with 2 or 3 boys:", c)
print("d) Families with at least 2 girls:", d)
