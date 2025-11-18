import numpy as np
import pandas as pd
N = 10000
die1 = np.random.randint(1, 7, N) 
die2 = np.random.randint(1, 7, N) 

joint_counts = pd.crosstab(die1, die2)
joint_prob = joint_counts / N  
print("Joint Probability P(X,Y):")
print(joint_prob)
marginal_X = joint_prob.sum(axis=1) 
marginal_Y = joint_prob.sum(axis=0) 

print("\nMarginal Probability P(X):")
print(marginal_X)

print("\nMarginal Probability P(Y):")
print(marginal_Y)
