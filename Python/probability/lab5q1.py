import numpy as np
total = 36
values = np.arange (1,7)
res = (2*values - 1)/total
for v, p in zip(values, res):
    print(f"P(X={v}) ≈ {p:.4f}")
