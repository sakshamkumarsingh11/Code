#q1 
# import numpy as np
# lam = 3
# n = 1000
# samples = np.random.poisson(lam, n)
# sample_mean = np.mean(samples)
# sample_variance = np.var(samples)

# print("Sample Mean:", sample_mean)
# print("Sample Variance:", sample_variance)

# q2
import numpy as np
import pandas as pd

# (A) for 12 hrs
lam = 5
calls_12_hrs = np.random.poisson(5,12)
print("Simulated calls in 12 hours:", calls_12_hrs)

# (B) 4 call in 1 hr 
sample = np.random.poisson(5,1000)
pex = np.mean(sample == 4)
print("Probability of 4 calls in an hour:", pex)

# (C) sample & mean
sample_mean = np.mean(sample)
sample_var = np.var(sample)
print(sample_mean)
print(sample_var)