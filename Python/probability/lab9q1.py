import numpy as np

sample_size = 40
num_samples = 1000
# 1.normal (mean=18, std=20)
normal_means = [np.mean(np.random.normal(18, 20, sample_size)) for _ in range(num_samples)]

#poision (lambda=10)
poisson_means = [np.mean(np.random.poisson(10, sample_size)) for _ in range(num_samples)]

# 3. exponential (lambda=20)
exponential_means = [np.mean(np.random.exponential(1/20, sample_size)) for _ in range(num_samples)] 
