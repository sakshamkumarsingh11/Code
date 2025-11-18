import numpy as np
samples = np.random.binomial(n=20, p=0.3, size=10000)
mean = np.mean(samples)
variance = np.var(samples)

print("Sample Mean:", mean)
print("Sample Variance:", variance)
